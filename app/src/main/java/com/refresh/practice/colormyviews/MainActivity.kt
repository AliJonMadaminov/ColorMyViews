package com.refresh.practice.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.refresh.practice.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners() {
        binding.apply {
            val clicableViews: List<View> = listOf(
                textBoxOne,
                textBoxTwo,
                textBoxThree,
                textBoxFour,
                textBoxFive,
                buttonRed,
                buttonGreen,
                buttonYellow,
                root
            )

            for (view in clicableViews) {
                view.setOnClickListener { makeColored(it) }
            }
        }


    }

    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class for background
            R.id.text_box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.text_box_two -> view.setBackgroundColor(Color.GRAY)

            // Boxes using android color resources for background
            R.id.text_box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.text_box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.text_box_five -> view.setBackgroundResource(android.R.color.holo_green_light)


            R.id.button_red -> binding.textBoxThree.setBackgroundResource(R.color.my_red)
            R.id.button_green -> binding.textBoxFour.setBackgroundResource(R.color.my_green)
            R.id.button_yellow -> binding.textBoxFive.setBackgroundResource(R.color.my_yellow)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}