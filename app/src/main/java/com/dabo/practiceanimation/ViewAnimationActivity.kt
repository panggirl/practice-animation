package com.dabo.practiceanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dabo.practiceanimation.frag.TweenAniamtionFrag
import kotlinx.android.synthetic.main.activity_view_animation.*

/**
 * Created by @author dabo on 2019/2/15.
 */
class ViewAnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_animation)

        tweenC.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val beginTransaction = supportFragmentManager.beginTransaction()
                beginTransaction.add(R.id.fl_content,TweenAniamtionFrag()).commit()
            }
        }
    }
}