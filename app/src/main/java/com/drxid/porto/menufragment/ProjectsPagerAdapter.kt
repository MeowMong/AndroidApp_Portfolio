package com.drxid.porto.menufragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ProjectsPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        // Jumlah tab yang ingin ditampilkan
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        // Mengembalikan fragment yang sesuai berdasarkan posisi tab
        return when (position) {
            0 -> MobileFragment()
            1 -> WebsiteFragment()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}
