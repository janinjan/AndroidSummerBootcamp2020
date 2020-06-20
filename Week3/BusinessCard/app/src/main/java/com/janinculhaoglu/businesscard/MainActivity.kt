package com.janinculhaoglu.businesscard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var experienceNumber = 0

    companion object {
        private const val EXPERIENCE_KEY = "EXPERIENCE_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newExperienceButton.setOnClickListener {
            changeExperienceDisplay()
        }

        if (savedInstanceState != null) {
            experienceNumber = savedInstanceState.getInt(EXPERIENCE_KEY)
            restoreExperience()
        } else {
            resetExperience()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(EXPERIENCE_KEY, experienceNumber)
    }

    private fun changeExperienceDisplay() {
        if (experienceNumber == experienceList.lastIndex) {
            experienceNumber = 0
        } else {
            experienceNumber += 1
        }
        experienceTextView.text = experienceList[experienceNumber]

        val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.scale)
        experienceTextView.startAnimation(bounceAnimation)
    }

    private fun restoreExperience() {
        experienceTextView.text = experienceList[experienceNumber]
    }

    private fun resetExperience() {
        experienceTextView.text = experienceList.first()
    }
}
