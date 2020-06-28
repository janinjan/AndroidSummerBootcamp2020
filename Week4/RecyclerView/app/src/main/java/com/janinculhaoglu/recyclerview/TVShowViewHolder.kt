package com.janinculhaoglu.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.cell_tvshow.view.*

class TVShowViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
    LayoutContainer {

    fun fillWithTVShow(tvShow: TVShow, onTVShowClicked: (TVShow) -> Unit) = with(containerView) {
        uiTitle.text = tvShow.title
        uiPoster.setImageResource(tvShow.poster)
        uiGenre.text = tvShow.genre
        uiRating.text = tvShow.rating.toString()
        rootView.setOnClickListener { onTVShowClicked(tvShow) }
    }
}