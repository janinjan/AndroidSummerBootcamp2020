package com.janinculhaoglu.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TVShowsAdapter.TvShowListClickListener {

    companion object {
        const val INTENT_LIST_KEY = "list"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ui_tvshowlist.adapter = TVShowsAdapter(this)
        ui_tvshowlist.layoutManager = LinearLayoutManager(this)
    }

    private fun showShowTvListItems(list: TVShow) {
        val tvShowListItem = Intent(this, DetailActivity::class.java)
        tvShowListItem.putExtra(INTENT_LIST_KEY, list)
        startActivity(tvShowListItem)
    }

    override fun listItemClicked(list: TVShow) {
        showShowTvListItems(list)
    }
}
