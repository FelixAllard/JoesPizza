package com.example.joespizza

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

object state{
    var orderType:String=""
}

class MainActivity : AppCompatActivity() {
    private lateinit var orderTypeTakeoutButton : Button
    private lateinit var orderTypeDeliveryButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val pagerAdapter = ScreenSlidePagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = pagerAdapter

        orderTypeTakeoutButton = this.findViewById(R.id.takeoutButton)
        orderTypeDeliveryButton = this.findViewById(R.id.deliveryButton)

        orderTypeDeliveryButton.setOnClickListener{
            state.orderType = "delivery"
        }
        orderTypeDeliveryButton.setOnClickListener{
            state.orderType = "takeout"
        }

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




