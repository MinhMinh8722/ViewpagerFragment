package com.mai.dang.viewpager.ui

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.mai.dang.viewpager.ui.dashboard.DashboardFragment
import com.mai.dang.viewpager.ui.home.HomeFragment
import com.mai.dang.viewpager.ui.notifications.NotificationsFragment
import java.lang.Exception

class MainPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {



    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> DashboardFragment()
            2 -> NotificationsFragment()
            else -> throw Exception()
        }
    }

    override fun getCount() = 3

}