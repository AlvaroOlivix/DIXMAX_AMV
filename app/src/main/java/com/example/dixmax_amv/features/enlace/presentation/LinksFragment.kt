package com.example.dixmax_amv.features.enlace.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dixmax_amv.databinding.FragmentListLinksBinding
import com.example.dixmax_amv.features.enlace.presentation.adapter.LinksAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class LinksFragment : Fragment() {
    private var _binding: FragmentListLinksBinding? = null
    private val binding get() = _binding!!

    private val viewModel: LinksViewModel by viewModel()
    private lateinit var adapter: LinksAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListLinksBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = LinksAdapter(onCLick = { navigateToListOptions(it.id) })
        setUpRecycler()
        setUpObserver()
        viewModel.loadLinks()
    }

    private fun setUpRecycler() {
        binding.apply {
            recyclerLinks.layoutManager = LinearLayoutManager(
                context, LinearLayoutManager.VERTICAL, false
            )
            recyclerLinks.adapter = adapter
        }
    }

    private fun setUpObserver() {
        val observer = Observer<LinksViewModel.UiState>() { linkObserved ->
            if (linkObserved.loading) {
                Log.d("@links", "Cargando Lista en observer")
            }
            if (linkObserved.error) {
                Log.d("@links", "Error cargando la lista en el observer")
            }
            adapter.submitList(linkObserved.links)
        }
        viewModel.uiState.observe(viewLifecycleOwner, observer)
    }

    private fun navigateToListOptions(linkId: String) {
        findNavController().navigate(LinksFragmentDirections.listLinksToDetailListOptions(linkId))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}