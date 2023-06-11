package com.drxid.porto.menufragment

/*
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.drxid.porto.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class FragmentProjects : Fragment() {
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_projects, container, false)

        viewPager = rootView.findViewById(R.id.viewPager2)
        tabLayout = rootView.findViewById(R.id.tabslayout)

        // Inisialisasi ViewPager2 dengan adapter yang sesuai
        val adapter = ProjectsPagerAdapter(requireActivity())
        viewPager.adapter = adapter

        // Menghubungkan TabLayout dengan ViewPager2 menggunakan TabLayoutMediator
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Mobile"
                    // Tambahkan fragment yang sesuai untuk tab "Mobile"
                    val fragmentMobile = MobileFragment()
                    childFragmentManager.beginTransaction()
                        .replace(R.id.viewPagerContainer, fragmentMobile)
                        .commit()
                }
                1 -> {
                    tab.text = "Website"
                    // Tambahkan fragment yang sesuai untuk tab "Website"
                    val fragmentWebsite = WebsiteFragment()
                    childFragmentManager.beginTransaction()
                        .replace(R.id.viewPagerContainer, fragmentWebsite)
                        .commit()
                }
            }
        }.attach()

        return rootView
    }
}
*/

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.drxid.porto.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ProjectsFragment : Fragment() {
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_projects, container, false)

        viewPager = rootView.findViewById(R.id.viewPager2)
        tabLayout = rootView.findViewById(R.id.tabslayout)

        // Inisialisasi ViewPager2 dengan adapter yang sesuai
        val adapter = ProjectsPagerAdapter(requireActivity())
        viewPager.adapter = adapter

        // Menghubungkan TabLayout dengan ViewPager2 menggunakan TabLayoutMediator
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Mobile"
                }
                1 -> {
                    tab.text = "Website"
                }
            }
        }.attach()

        return rootView
    }
}

