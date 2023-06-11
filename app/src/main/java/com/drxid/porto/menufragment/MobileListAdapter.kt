package com.drxid.porto.menufragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.drxid.porto.R

class MobileListAdapter(private val mobileProjectsData: ArrayList<MobileData>) : RecyclerView.Adapter<MobileListAdapter.ProjectsViewHolder>() {
    class ProjectsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mobileProjectsName: TextView = itemView.findViewById(R.id.mobile_projects_name)
        val mobileProjectsJob: TextView = itemView.findViewById(R.id.mobile_projects_job)
        val mobileProjectsDate: TextView = itemView.findViewById(R.id.mobile_projects_date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_projects_mobile, parent, false)
        return ProjectsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProjectsViewHolder, position: Int) {
        val (name, job, date) = mobileProjectsData[position]
        holder.mobileProjectsName.text = name
        holder.mobileProjectsJob.text = job
        holder.mobileProjectsDate.text = date

    }

    override fun getItemCount(): Int {
        return mobileProjectsData.size
    }
}
