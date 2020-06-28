package com.janinculhaoglu.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvShow: TVShow by lazy { intent.getParcelableExtra(MainActivity.INTENT_LIST_KEY) as TVShow }
        setTvShow(tvShow)
    }

    fun setTvShow(tvShow: TVShow) {
        title = tvShow.title
        detailPoster.setImageResource(tvShow.poster)
        titleTextView.text = tvShow.title
        descriptionTextView.text = tvShow.summary
        releaseDate.text = tvShow.releaseDate
    }
 }
