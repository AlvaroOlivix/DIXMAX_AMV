package com.example.dixmax_amv.features.serie.presentation.uiSeason

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dixmax_amv.R
import com.example.dixmax_amv.databinding.FragmentListSeasonsBinding
import com.example.dixmax_amv.features.serie.domain.Serie
import com.example.dixmax_amv.features.serie.presentation.uiEpisode.adapterEpisode.EpisodeAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class SeasonsFragment() : Fragment(R.layout.fragment_list_seasons) {

    private var _binding: FragmentListSeasonsBinding? = null
    private val binding get() = _binding!!

    private val viewModel: SeasonsViewModel by viewModel()

    private lateinit var episodeAdapter: EpisodeAdapter

    private val args: SeasonsFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListSeasonsBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        episodeAdapter = EpisodeAdapter()
        setUpRecycler()
        setUpObserver()
        viewModel.getSeasons(args.serieId)
        binding.mainToolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }
    }

    private fun setUpRecycler() {
        binding.apply {
            recyclerEpisodes.layoutManager = LinearLayoutManager(
                context, LinearLayoutManager.VERTICAL,
                false
            )
            recyclerEpisodes.adapter = episodeAdapter
        }
    }

    private fun setUpObserver() {
        val observer = Observer<SeasonsViewModel.UiState>() {
            if (it.loading) {
                Log.d("@te", "Cargando datos")
            }
            if (it.error) {
                Log.d("@te", "Error en la carga de datos")
            }
            bindView(it.serie)
            episodeAdapter.submitList(it.episodes)
            it.serie?.let { serie ->
                setupSeasonMenu(serie)
            }
        }
        viewModel.uiState.observe(viewLifecycleOwner, observer)
    }
    private fun bindView(serie: Serie?) {
        binding.apply {
            if (serie != null) {
                mainToolbar.setTitle(serie.title)
                ratedSeason.text = serie.score
                description.text = serie.rated
                mainToolbar.setTitle(serie.title)
                description.setOnClickListener { navigateToInfoSerie(serie.id) }
            }
        }
    }

    private fun setupSeasonMenu(serie: Serie) {
        binding.btnSelectSeason.setOnClickListener { anchor ->
            val popup = PopupMenu(requireContext(), anchor)
            serie.seasons.forEachIndexed { index, season ->
                popup.menu.add(0, index, index, season.name)
            }
            popup.setOnMenuItemClickListener { item ->
                val selected = serie.seasons[item.itemId]
                binding.btnSelectSeason.text = selected.name
                viewModel.selectSeason(item.itemId)
                true
            }
            popup.show()
        }
    }

    private fun navigateToInfoSerie(serieId: String) {
        findNavController().navigate(
            SeasonsFragmentDirections.fragmentSeasonsToFloatInfoSeasons(
                serieId
            )
        )
    }

}