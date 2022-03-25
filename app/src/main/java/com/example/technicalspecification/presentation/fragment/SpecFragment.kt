package com.example.technicalspecification.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.technicalspecification.databinding.ItemSpecificationsBinding

class SpecFragment : Fragment() {

    private lateinit var binding: ItemSpecificationsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ItemSpecificationsBinding.inflate(inflater, container, false)
        //init()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

//    private fun init() {
//        val viewModel = ViewModelProvider(this)[SpecViewModel::class.java]
//        viewModel.getCharacteristicsObserver().observe(viewLifecycleOwner, {
//            with(binding) {
//                    tvCountryOrigin.text = it.data.characteristics.characteristics.keys.toString()
//                    tvExpirationDate.text = it.data.characteristics.characteristics.keys.toString()
//                    tvStorageTemp.text = it.data.characteristics.characteristics.keys.toString()
//                    tvCalories.text = it.data.characteristics.characteristics.keys.toString()
//                    tvProteins.text = it.data.characteristics.characteristics.keys.toString()
//                    tvFats.text = it.data.characteristics.characteristics.keys.toString()
//                    tvCarbohydrates.text = it.data.characteristics.characteristics.keys.toString()
//
//                    tvCountryValue.text = it.data.characteristics.characteristics.values.toString()
//                    tvDateValue.text = it.data.characteristics.characteristics.values.toString()
//                    tvTemperatureValue.text = it.data.characteristics.characteristics.values.toString()
//                    tvCaloriesValue.text = it.data.characteristics.characteristics.values.toString()
//                    tvProteinsValue.text = it.data.characteristics.characteristics.values.toString()
//                    tvFatsValue.text = it.data.characteristics.characteristics.values.toString()
//                    tvCarbohydratesValue.text = it.data.characteristics.characteristics.values.toString()
//            }
//        })
//        viewModel.makeCharacteristicsApiCall()
//    }

    override fun onResume() {
        super.onResume()
        binding.root.requestLayout()
    }

    companion object {
        fun newInstance() = SpecFragment()
    }
}