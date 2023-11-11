package com.example.view_pager

import android.view.View
import androidx.viewpager2.widget.ViewPager2.PageTransformer
import kotlin.math.abs

class ChangeScreenTransformer:PageTransformer {
    private val minScale = 0.5f
    private val horizontalOffset = (30).dp


    override fun transformPage(page: View, position: Float) {
        val width = page.width
//        page.translationX = horizontalOffset * position

//        page.pivotX = page.width * 50f



        when {
            position < -1 -> {
                page.alpha = 0f
            }
            position <= 0 -> {
                page.alpha = 1f
                //РАЗМЕР
                page.scaleX = 1f
                page.scaleY = 1f

                page.translationX = -(width * -position/2)

                val scale = minScale + (1 - minScale) * (1 - abs(position))
                page.scaleX = scale
                page.scaleY = scale
            }

            position <= 1 -> {
                page.alpha = 1 - position
            }

            else -> page.alpha = 0f
        }
    }

}