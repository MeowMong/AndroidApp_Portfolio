package com.drxid.porto.menufragment


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.drxid.porto.R

class WebsiteListAdapter(private val websiteProjectsData: ArrayList<WebsiteData>) : RecyclerView.Adapter<WebsiteListAdapter.ProjectsViewHolder>() {
    class ProjectsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val websiteProjectsName: TextView = itemView.findViewById(R.id.website_projects_name)
        val websiteProjectsJob: TextView = itemView.findViewById(R.id.website_projects_job)
        val websiteProjectsDate: TextView = itemView.findViewById(R.id.website_projects_date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_projects_website, parent, false)
        return ProjectsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProjectsViewHolder, position: Int) {
        val (name, job, date) = websiteProjectsData[position]
        holder.websiteProjectsName.text = name
        holder.websiteProjectsJob.text = job
        holder.websiteProjectsDate.text = date

    }

    override fun getItemCount(): Int {
        return websiteProjectsData.size
    }
}
