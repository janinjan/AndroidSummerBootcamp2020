package com.janinculhaoglu.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TVShowsAdapter(private val onTVShowClicked: (TVShow) -> Unit) :
    RecyclerView.Adapter<TVShowViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TVShowViewHolder {
        val rootView =
            LayoutInflater.from(parent.context).inflate(R.layout.cell_tvshow, parent, false)
        return TVShowViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return tvshowsList.size
    }

    override fun onBindViewHolder(holder: TVShowViewHolder, position: Int) {
        holder.fillWithTVShow(tvshowsList[position], onTVShowClicked)
    }
}