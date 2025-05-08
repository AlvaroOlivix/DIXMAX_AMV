package com.example.dixmax_amv.features.serie.presentation.uiHome

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dixmax_amv.databinding.FragmentHomeBinding
import com.example.dixmax_amv.features.movie.presentation.adapter.MoviesAdapter
import com.example.dixmax_amv.features.serie.presentation.uiSerie.adater.SerieAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private val viewModel: HomeViewModel by viewModel()
    private lateinit var serieAdapter: SerieAdapter
    private lateinit var movieAdapter: MoviesAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        serieAdapter = SerieAdapter(
            bookMarkClick = {},
            oClick = { }
        )
        movieAdapter = MoviesAdapter(
            onCLick = {},
            onClickFavorite = {}
        )
        setUpRecyclers()
        setUpObserver()
        viewModel.getHomeLoad()

    }

    private fun setUpObserver() {
        val observer = Observer<HomeViewModel.UiState>() {
            if (it.loading) {
                Log.d("@dev", "Cargando")
            }
            if (it.error) {
                Log.d("@dev", "Error en la lista de datos")
            }
            val serInitial = it.series.take(8)
            serieAdapter.submitList(serInitial)
            movieAdapter.submitList(it.movies)
        }
        viewModel.uiState.observe(viewLifecycleOwner, observer)
    }

    private fun setUpRecyclers() {
        binding.apply {
            recyclerSeries.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            recyclerSeries.adapter = serieAdapter

            recyclerMovies.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            recyclerMovies.adapter = movieAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}