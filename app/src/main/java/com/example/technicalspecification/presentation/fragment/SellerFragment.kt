package com.example.technicalspecification.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.technicalspecification.databinding.FragmentSellerBinding
import com.example.technicalspecification.viewmodel.SellerViewModel
import com.squareup.picasso.Picasso

class SellerFragment : Fragment() {

    private lateinit var binding: FragmentSellerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSellerBinding.inflate(inflater, container, false)
        init(binding.root)
        return binding.root
    }

    private fun init(view: View) {
        val viewModel = ViewModelProvider(this)[SellerViewModel::class.java]
        viewModel.getSellerObserver().observe(viewLifecycleOwner, {
            with(binding) {
                nameCompanySeller.text = it.data.brand.slug
                subTitleSeller.text = it.data.shop.subTitle
                infoSeller.text = it.data.shop.info

                Picasso.get().load(it.data.brand.image).into(ivSeller)
            }
        })
        viewModel.makeSellerApiCall()

        view.setOnClickListener {
            Toast.makeText(context, "Click", Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        fun newInstance() = SellerFragment()
    }
}