package com.example.technicalspecification

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.technicalspecification.databinding.ActivityMainBinding
import com.example.technicalspecification.presentation.fragment.DetailFragment
import com.example.technicalspecification.presentation.fragment.PagerFragment
import com.example.technicalspecification.presentation.fragment.SellerFragment
import com.google.android.material.badge.BadgeDrawable

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navMenu()
        iconNumber()

        initFragment(R.id.placeHolder1, DetailFragment.newInstance())
        initFragment(R.id.placeHolder2, PagerFragment.newInstance())
        initFragment(R.id.placeHolder3, SellerFragment.newInstance())
    }

    private fun initFragment(place : Int, fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .add(place, fragment)
            .commit()
    }

    private fun navMenu() {
        binding.navMenu.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.item1 -> {
                    Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show()
                }
                R.id.item2 -> {
                    Toast.makeText(this, "Item 2", Toast.LENGTH_SHORT).show()
                }
                R.id.item3 -> {
                    Toast.makeText(this, "Item 3", Toast.LENGTH_SHORT).show()
                }
                R.id.item4 -> {
                    Toast.makeText(this, "Item 4", Toast.LENGTH_SHORT).show()
                }
                R.id.item5 -> {
                    Toast.makeText(this, "Item 5", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }

    private fun iconNumber() {
        val badgeDrawable : BadgeDrawable = binding.navMenu.getOrCreateBadge(R.id.item3)
        badgeDrawable.isVisible = true
        badgeDrawable.backgroundColor = Color.parseColor("#7ABC2F")
        badgeDrawable.number = 15
    }
}