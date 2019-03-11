package com.dabo.practiceanimation.frag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.*
import androidx.fragment.app.Fragment
import com.dabo.practiceanimation.R
import kotlinx.android.synthetic.main.fragment_tween.*


/**
 * 补间动画
 * Created by @author dabo on 2019/2/15.
 */
class TweenAniamtionFrag : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tween, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        translateBt.setOnClickListener {
            val translate=TranslateAnimation(0f,300f,0f,300f)
            // fromXDelta 视图在水平方向 x 上的起始位置
            // toXDelta 视图在水平方向 x 上的结束位置
            // fromYDelta 、 toYDelta 同上
            translate.duration=2000
            targetV.startAnimation(translate)

        }
        scaleBt.setOnClickListener {
            val scale=ScaleAnimation(0f,3f,0f,3f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f)
            scale.duration=2000
            targetV.startAnimation(scale)

        }
        rotateBt.setOnClickListener {
            val rotate_xml = AnimationUtils.loadAnimation(context, R.anim.rotate)

            targetV.startAnimation(rotate_xml)

            /*
            val rotate=RotateAnimation(0f,360f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f)
            val interpolator = LinearInterpolator()
            rotate.interpolator=interpolator
            rotate.repeatCount=-1
            rotate.repeatMode=Animation.RESTART

            rotate.duration=5000
            targetV.startAnimation(rotate)*/

        }

            alphaBt.setOnClickListener {
            val alpha=AlphaAnimation(0f,1f)
                alpha.duration=5000
            targetV.startAnimation(alpha)

        }
        setBt.setOnClickListener {
            val set=AnimationSet(true)
            val interpolator = LinearInterpolator()
            set.interpolator=interpolator
            set.duration=2000

            val rotate=RotateAnimation(0f,360f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f)
            val scale=ScaleAnimation(0f,3f,0f,3f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f)
            val translate=TranslateAnimation(0f,300f,0f,300f)
            val alpha=AlphaAnimation(0f,1f)
            set.addAnimation(rotate)
            set.addAnimation(translate)
            set.addAnimation(scale)
            set.addAnimation(alpha)
            targetV.startAnimation(set)

        }



    }

}