package com.dabo.practiceanimation.frag

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.DecelerateInterpolator
import androidx.fragment.app.Fragment
import com.dabo.practiceanimation.R
import kotlinx.android.synthetic.main.frag_property.*

/**
 * Created by @author dabo on 2019/2/23.
 */
class PropertyAnimFrag : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        return  inflater.inflate(R.layout.frag_property, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        translateBt.setOnClickListener {
            val animator=ObjectAnimator.ofFloat(it,"translationX",it.translationX,300f,it.translationX)
            animator.duration=5000
            animator.interpolator = DecelerateInterpolator()
            animator.start()
        }
    }

}