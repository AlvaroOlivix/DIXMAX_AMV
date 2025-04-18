package com.example.dixmax_amv.features.serie.presentation

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
import com.example.dixmax_amv.databinding.FragmentListSeriesBinding
import com.example.dixmax_amv.features.serie.presentation.adater.SerieAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class SeriesFragment : Fragment() {

    private var _binding: FragmentListSeriesBinding? = null
    private val binding get() = _binding!!

    private val viewModel: SeriesViewModel by viewModel()

    private lateinit var adapter: SerieAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListSeriesBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("@dev", "Fragment cargado")
        adapter = SerieAdapter(
            bookMarkClick = { viewModel.toggleBookmark(it) },
            oClick = { navigateToDetail(it.id) }
        )
        setUpRecycler()
        setUpObserver()
        viewModel.loadAlbums()
        binding.lToolBar.mainToolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.action -> {
                    viewModel.showBookMarked()
                    if (viewModel.isBookmarked) {
                        it.setIcon(R.drawable.baseline_bookmark_24)
                    } else (it.setIcon(R.drawable.outline_bookmark_border_24))
                    true
                }

                R.id.newest -> {
                    viewModel.showNewest()
                    true
                }

                R.id.ageRate -> {
                    viewModel.showAgeRated()
                    true
                }

                else -> false
            }
        }
    }

    private fun setUpObserver() {
        Log.d("@dev", "Se ha configurado el observer")
        val observer = Observer<SeriesViewModel.UiState>() {
            if (it.loading) {
                Log.d("@dev", "Cargando datos")
            }
            if (it.error) {
                Log.d("@dev", "Error en la carga de datos")
            }
            adapter.submitList(it.series)
        }
        viewModel.uiState.observe(viewLifecycleOwner, observer)
    }

    private fun setUpRecycler() {
        binding.apply {
            recyclerSeries.layoutManager =
                GridLayoutManager(context, 3) // o LinearLayoutManager si es vertical
            recyclerSeries.adapter = adapter
        }
    }

    private fun navigateToDetail(serieId: String) {
        findNavController().navigate(
            SeriesFragmentDirections.fragmentSeriesToFragmentDetailSerie(
                serieId
            )
        )
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}