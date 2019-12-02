package com.mai.dang.viewpager.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.mai.dang.viewpager.R
import com.mai.dang.viewpager.add

class DashboardChildFragment : Fragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_dashboard_child, container, false)
        val button = root.findViewById<Button>(R.id.button)
        button.setOnClickListener(this)
        return root
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button -> {
                moveToChild()
            }
        }
    }

    fun moveToChild() {
        add(requireFragmentManager(), R.id.dashboard_holder, DashboardChildFragment1())
    }
}