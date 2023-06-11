package com.drxid.porto.menufragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.drxid.porto.R

class WebsiteFragment : Fragment() {
    private lateinit var websiteRecyclerView: RecyclerView
    private lateinit var websiteListAdapter: WebsiteListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_website, container, false)

        websiteRecyclerView = rootView.findViewById(R.id.rv_project)
        websiteListAdapter = WebsiteListAdapter(getWebsiteData())
        websiteRecyclerView.adapter = websiteListAdapter
        websiteRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        return rootView
    }

    private fun getWebsiteData(): ArrayList<WebsiteData> {
        val websiteNameArray = resources.getStringArray(R.array.web_projects_name)
        val websiteJobArray = resources.getStringArray(R.array.web_projects_job)
        val websiteDateArray = resources.getStringArray(R.array.web_projects_date)

        val projectsDataList = ArrayList<WebsiteData>()

        for (i in websiteNameArray.indices) {
            val projectsData = WebsiteData(
                websiteNameArray[i],
                websiteJobArray[i],
                websiteDateArray[i]
            )
            projectsDataList.add(projectsData)
        }

        return projectsDataList
    }
}