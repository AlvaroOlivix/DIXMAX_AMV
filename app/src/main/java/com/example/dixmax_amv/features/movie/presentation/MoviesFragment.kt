package com.example.dixmax_amv.features.movie.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.dixmax_amv.R
import com.example.dixmax_amv.databinding.FragmentListMoviesBinding
import com.example.dixmax_amv.features.movie.presentation.adapter.MoviesAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class MoviesFragment : Fragment() {

    private var _binding: FragmentListMoviesBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MoviesViewModel by viewModel()
    private lateinit var adapter: MoviesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListMoviesBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = MoviesAdapter(
            onCLick = { navigateToMovieDetail(it.id) },
            onClickFavorite = { viewModel.setUpFavorite(it) }
        )
        setUpObserver()
        setUpRecycler()
        viewModel.loadMovies()
        binding.apply {
            floatingActionButton.setOnClickListener {
                floatingActionButton.setImageResource(R.drawable.baseline_favorite_24)
                viewModel.showFavorites()
            }
        }
    }

    private fun setUpObserver() {
        val observer = Observer<MoviesViewModel.UiState>() {
            if (it.loading) {
                Log.d("@dev", "Cargando lista en observador")
            }
            if (it.error) {
                Log.d("@dev", "Error en la carga del observador")
            }
            adapter.submitList(it.movies)
        }
        viewModel.uiState.observe(viewLifecycleOwner, observer)
    }

    private fun setUpRecycler() {
        binding.apply {
            recyclerSeries.layoutManager = GridLayoutManager(context, 3)
            recyclerSeries.adapter = adapter
        }
    }

    private fun navigateToMovieDetail(movieId: String) {
        findNavController().navigate(
            MoviesFragmentDirections.fragmentMoviesToFragmentDetailMovie(
                movieId
            )
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}