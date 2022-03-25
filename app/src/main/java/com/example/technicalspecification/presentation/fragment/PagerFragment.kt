package com.example.technicalspecification.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.technicalspecification.R
import com.example.technicalspecification.presentation.adapters.ScreenSlidePagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class PagerFragment : Fragment() {
    private val listTextTab = listOf(DESC, SPEC)
    private val resList = listOf(DescFragment.newInstance(), SpecFragment.newInstance())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tab = view.findViewById<TabLayout>(R.id.tabLayout)
        val vp2 = view.findViewById<ViewPager2>(R.id.vp2)
        val adapter = ScreenSlidePagerAdapter(activity as AppCompatActivity, resList)
        vp2.adapter = adapter
        TabLayoutMediator(tab, vp2) { tab2, pos ->
           tab2.text = listTextTab[pos]
        }.attach()
    }

    companion object {
        fun newInstance() = PagerFragment()

        private const val DESC = "Описание"
        private const val SPEC = "Характеристики"
    }
}