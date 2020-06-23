package com.janinculhaoglu.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cell_tvshow.view.*


class TVShowsAdapter(val clickListener: TvShowListClickListener) : RecyclerView.Adapter<TVShowsAdapter.TVShowsViewHolder>() {

    interface TvShowListClickListener {
        fun listItemClicked(list: TVShow)
    }

    fun onTVShowClick(index: Int, context: Context) {
        val show = tvshowsList[index]
        println(show.title) // Test to print the title of the selected cell
    }

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
        holder.itemView.setOnClickListener {
            clickListener.listItemClicked(tvShow)
        }
    }

    // Inner class to be able to have access to OnTVShowClick()
    inner class TVShowsViewHolder(rootView: View) : RecyclerView.ViewHolder(rootView),
        View.OnClickListener {
        private val title = rootView.ui_title
        private val poster = rootView.ui_poster
        private val genre = rootView.ui_genre
        private val rating = rootView.ui_rating

        init {
            rootView.setOnClickListener(this)
        }

        fun fillWithTVShow(tvShow: TVShow) {
            title.text = tvShow.title
            poster.setImageResource(tvShow.poster)
            genre.text = tvShow.genre
            rating.text = tvShow.rating.toString()
        }

        override fun onClick(v: View?) {
            if (v != null) {
                onTVShowClick(adapterPosition, v.context) // We give click info to the adapter
            }
        }
    }
}