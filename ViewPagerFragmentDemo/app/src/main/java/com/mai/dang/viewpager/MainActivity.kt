package com.mai.dang.viewpager

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mai.dang.viewpager.ui.MainPagerAdapter

class MainActivity : AppCompatActivity() {

    private var prevItem: MenuItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val viewPager: ViewPager = findViewById(R.id.viewpager)
        val adapter = MainPagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter

        navView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> viewPager.currentItem = 0
                R.id.navigation_dashboard -> viewPager.currentItem = 1
                R.id.navigation_notifications -> viewPager.currentItem = 2
            }
            false
        }

        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                if (prevItem != null) {
                    prevItem!!.isChecked = false
                } else {
                    navView.menu.getItem(0).isChecked = false
                }

                navView.menu.getItem(position).isChecked = true
                prevItem = navView.menu.getItem(position)
            }
        })
    }
}
