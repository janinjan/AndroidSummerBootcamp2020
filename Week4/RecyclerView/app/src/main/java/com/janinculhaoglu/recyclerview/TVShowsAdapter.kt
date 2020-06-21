package com.janinculhaoglu.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cell_tvshow.view.*


class TVShowsAdapter : RecyclerView.Adapter<TVShowsAdapter.TVShowsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TVShowsViewHolder {
        // Create the view in XML
        val rootView =
            LayoutInflater.from(parent.context).inflate(R.layout.cell_tvshow, parent, false)
        // Create a ViewHolder to control this view
        val holder = TVShowsViewHolder(rootView)

        return holder
    }

    override fun getItemCount(): Int {
        return tvshowsList.size
    }

    override fun onBindViewHolder(holder: TVShowsViewHolder, position: Int) {
        val tvShow = tvshowsList[position]
        holder.fillWithTVShow(tvShow)
    }

    class TVShowsViewHolder(rootView: View) : RecyclerView.ViewHolder(rootView) {
        private val title = rootView.ui_title
        private val poster = rootView.ui_poster
        private val genre = rootView.ui_genre
        private val rating = rootView.ui_rating

        fun fillWithTVShow(tvShow: TVShow) {
            title.text = tvShow.title
            poster.setImageResource(tvShow.poster)
            genre.text = tvShow.genre
            rating.text = tvShow.rating.toString()
        }
    }
}