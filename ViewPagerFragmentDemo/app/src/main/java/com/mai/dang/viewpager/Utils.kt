package com.mai.dang.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun Fragment.add(fragmentManager: FragmentManager, frameId: Int, fragment: Fragment) {
    fragmentManager.beginTransaction().replace(frameId, fragment).addToBackStack(null).commit()
}