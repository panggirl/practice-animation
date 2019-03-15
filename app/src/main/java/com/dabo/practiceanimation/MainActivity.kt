package com.dabo.practiceanimation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view_animal.setOnClickListener {
            startActivity(Intent(this,ViewAnimationActivity::class.java))
        }

        test.setOnClickListener {
            startActivity(Intent(this,TestActivity::class.java))
        }
    }
}
