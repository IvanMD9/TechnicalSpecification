package com.example.technicalspecification.presentation.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ScreenSlidePagerAdapter(
    fa: FragmentActivity,
    private val fragmentsList: List<Fragment>
) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = fragmentsList.size

    override fun createFragment(position: Int): Fragment = fragmentsList[position]
}