package com.example.technicalspecification.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.technicalspecification.databinding.ItemDescriptionBinding
import com.example.technicalspecification.viewmodel.DescViewModel

class DescFragment : Fragment() {

    private lateinit var binding: ItemDescriptionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ItemDescriptionBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    private fun init() {
        val viewModel = ViewModelProvider(this)[DescViewModel::class.java]
        viewModel.getDescObserver().observe(viewLifecycleOwner, {
            with(binding) {
                tvItemDesc.text = it.data.description
            }
        })
        viewModel.makeDescApiCall()
    }

    override fun onResume() {
        super.onResume()
        binding.root.requestLayout()
    }

    companion object {
        fun newInstance() = DescFragment()
    }
}