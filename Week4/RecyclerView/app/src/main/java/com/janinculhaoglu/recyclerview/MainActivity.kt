package com.janinculhaoglu.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ui_tvshowlist.adapter = TVShowsAdapter()
        ui_tvshowlist.layoutManager = LinearLayoutManager(this)
    }
}
