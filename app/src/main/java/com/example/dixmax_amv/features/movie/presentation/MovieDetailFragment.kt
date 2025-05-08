package com.example.dixmax_amv.features.movie.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.example.dixmax_amv.core.extensions.loadImageUrl
import com.example.dixmax_amv.databinding.FragmentDetailMovieBinding
import com.example.dixmax_amv.features.movie.domain.model.Movie
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class MovieDetailFragment : BottomSheetDialogFragment() {
    private var _binding: FragmentDetailMovieBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MovieDetailViewModel by viewModel()

    private val args: MovieDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailMovieBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpObserver()
        viewModel.load(args.movieId)

    }

    private fun setUpObserver() {
        val observer = Observer<MovieDetailViewModel.UiState>() {
            if (it.loading) {
                Log.d("@dev", "FG: Loading observer")
            }
            if (it.error) {
                Log.d("@dev", "FG: Error en el observer")
            }
            bindData(it.movie)
        }
        viewModel.uiState.observe(viewLifecycleOwner, observer)
    }

    private fun bindData(movie: Movie?) {
        binding.apply {
            if (movie != null) {
                title.text = movie.title
                awards.text = movie.award.name
                poster.loadImageUrl(movie.poster)
                description.text = movie.description
            }
            else {
                Log.d("@dev", "FG: No hay datos para mostrar")
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}