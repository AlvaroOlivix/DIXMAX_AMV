package com.example.dixmax_amv.features.enlace.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dixmax_amv.databinding.FragmentListOptionsBinding
import com.example.dixmax_amv.features.enlace.presentation.adapterOptions.OptionsAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class OptionsFragment : Fragment() {

    private var _binding: FragmentListOptionsBinding? = null
    private val binding get() = _binding!!

    private val viewModel: OptionsViewModel by viewModel()
    private lateinit var adapter: OptionsAdapter
    private val args: OptionsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListOptionsBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = OptionsAdapter()
        setUpRecycler()
        setUpObserver()
        viewModel.loadOptions(args.linkId)
    }

    private fun setUpObserver() {
        val observer = Observer<OptionsViewModel.UiState>() {
            if (it.loading) {
                Log.d("", "")
            }
            if (it.error) {
                Log.d("", "")
            }
            adapter.submitList(it.link?.options)
        }
        viewModel.uiState.observe(viewLifecycleOwner, observer)
    }

    private fun setUpRecycler() {
        binding.apply {
            recycelrOptions.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            recycelrOptions.adapter = adapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}