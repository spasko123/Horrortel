package com.spas.spasov.horrortel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewAllStoriesAdapter(private val storyList: List<String>) :
    RecyclerView.Adapter<ViewAllStoriesAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.txtTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_all_stories_recycler_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val storyTitle = storyList[position]
        holder.titleTextView.text = storyTitle
    }

    override fun getItemCount(): Int {
        return storyList.size
    }
}