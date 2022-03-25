package com.example.technicalspecification.presentation.fragment

import android.graphics.Paint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.technicalspecification.databinding.FragmentDetailBinding
import com.example.technicalspecification.viewmodel.DetailViewModel
import com.squareup.picasso.Picasso

class DetailFragment : Fragment() {

    private lateinit var binding : FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init() {
        val viewModel = ViewModelProvider(this)[DetailViewModel::class.java]
        viewModel.getDetailObserver().observe(viewLifecycleOwner, {
            with(binding) {
                title.text = it.data.title
                subTitle.text = it.data.subTitle
                newPrice.text = it.data.price.value.toString()
                currencyNewPrice.text = it.data.price.currency
                oldPrice.text = it.data.oldPrice.value.toString()
                oldPrice.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
                currencyOldPrice.text = it.data.oldPrice.currency
                tvRating.text = it.data.rating.score.toString()
                Picasso.get()
                    .load("http://80.78.246.225:3000/api/images/products/example-3.jpg")
                    .into(ivFruit)
            }
        })
        viewModel.makeDetailApiCall()
    }

    companion object {
        fun newInstance() = DetailFragment()
    }
}