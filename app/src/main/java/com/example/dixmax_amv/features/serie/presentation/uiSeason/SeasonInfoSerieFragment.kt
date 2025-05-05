package com.example.dixmax_amv.features.serie.presentation.uiSeason

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.dixmax_amv.databinding.FloatInfoSerieBinding
import com.example.dixmax_amv.features.serie.domain.Serie
import org.koin.androidx.viewmodel.ext.android.viewModel

class SeasonInfoSerieFragment : DialogFragment() {

    private var _binding: FloatInfoSerieBinding? = null
    private val binding get() = _binding!!

    private val viewModel: SeasonsInfoSerieViewModel by viewModel()

    private val args: SeasonInfoSerieFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FloatInfoSerieBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpObserver()
        viewModel.getInfo(args.serieId)
    }

    private fun setUpObserver() {
        val observer = Observer<SeasonsInfoSerieViewModel.UiState>() {
            bind(it.serie)
        }
        viewModel.uiState.observe(viewLifecycleOwner, observer)
    }

    private fun bind(serie: Serie?) {
        binding.apply {
            if (serie != null) {
                dialogDescription.text = serie.rated
                closeBtn.setOnClickListener {
                    findNavController().navigateUp()
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}