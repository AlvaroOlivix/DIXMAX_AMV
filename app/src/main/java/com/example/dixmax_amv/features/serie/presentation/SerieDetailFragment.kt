package com.example.dixmax_amv.features.serie.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.dixmax_amv.core.extensions.loadImageUrl
import com.example.dixmax_amv.databinding.FragmentDetailSerieBinding
import com.example.dixmax_amv.features.serie.domain.Serie
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class SerieDetailFragment : BottomSheetDialogFragment() {
    private var _binding: FragmentDetailSerieBinding? = null
    private val binding get() = _binding!!

    private val viewModel: SerieDetailViewModel by viewModel()

    private val args: SerieDetailFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailSerieBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpObserver()
        viewModel.loadSerie(args.serieId)

    }


    private fun setUpObserver() {
        val observer = Observer<SerieDetailViewModel.UiState>() {
            if (it.loading) {
                Log.d("@dev", "Cargando Datos")
            }
            if (it.error) {
                Log.d("@dev", "Error en la carga de datos")
            }
            bind(it.serie)
        }
        viewModel.uiState.observe(viewLifecycleOwner, observer)
    }

    private fun bind(serie: Serie?) {
        binding.apply {
            if (serie != null) {
                title.text = serie.title
                year.text = serie.released
                seasons.text = serie.seasons
                description.text = serie.title
                poster.loadImageUrl(serie.poster)
                exitButton.setOnClickListener{
                    findNavController().navigateUp()
                }
            } else {
                Log.d("@dev", "No hay datos para mostrar")
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}