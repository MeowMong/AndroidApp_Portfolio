package com.drxid.porto.menufragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.drxid.porto.R

class MobileFragment : Fragment() {
    private lateinit var mobileRecyclerView: RecyclerView
    private lateinit var mobileListAdapter: MobileListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_mobile, container, false)

        mobileRecyclerView = rootView.findViewById(R.id.rv_projects)
        mobileListAdapter = MobileListAdapter(getMobileData())
        mobileRecyclerView.adapter = mobileListAdapter
        mobileRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        return rootView
    }

    private fun getMobileData(): ArrayList<MobileData> {
        val mobileNameArray = resources.getStringArray(R.array.mobile_projects_name)
        val mobileJobArray = resources.getStringArray(R.array.mobile_projects_job)
        val mobileDateArray = resources.getStringArray(R.array.mobile_projects_date)

        val projectsDataList = ArrayList<MobileData>()

        for (i in mobileNameArray.indices) {
            val projectsData = MobileData(
                mobileNameArray[i],
                mobileJobArray[i],
                mobileDateArray[i]
            )
            projectsDataList.add(projectsData)
        }

        return projectsDataList
    }
}