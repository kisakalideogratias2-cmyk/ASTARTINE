package com.astartine.assistant

import android.app.Activity
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.parseColor("#0A1A3A"))
            setPadding(48, 48, 48, 48)
        }

        val title = TextView(this).apply {
            text = "ASTARTINE™"
            textSize = 32f
            setTextColor(Color.WHITE)
            typeface = Typeface.DEFAULT_BOLD
            gravity = Gravity.CENTER
        }

        val slogan = TextView(this).apply {
            text = "Born from Silence. Built Beyond Limits."
            textSize = 14f
            setTextColor(Color.parseColor("#8FB4FF"))
            gravity = Gravity.CENTER
        }

        val status = TextView(this).apply {
            text = "Habari! Mimi ni ASTARTINE."
            textSize = 18f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
            setPadding(0, 64, 0, 32)
        }

        val button = Button(this).apply {
            text = "Gusa hapa"
            setOnClickListener {
                status.text = "Nimekusikia! App inafanya kazi. ✅"
            }
        }

        layout.addView(title)
        layout.addView(slogan)
        layout.addView(status)
        layout.addView(button)

        setContentView(layout)
    }
}
