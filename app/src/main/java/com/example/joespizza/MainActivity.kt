package com.example.joespizza

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val pagerAdapter = ScreenSlidePagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = pagerAdapter
    }

    private inner class ScreenSlidePagerAdapter(fm: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fm, lifecycle) {
        override fun getItemCount(): Int = 3

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> SelectTypeFragment()
                1 -> PizzaSelectionFragment() // Implement this Fragment according to your needs
                2 -> ReviewOrderFragment() // Implement this Fragment according to your needs
                else -> throw IllegalStateException("Unexpected position $position")
            }
        }
    }
}




