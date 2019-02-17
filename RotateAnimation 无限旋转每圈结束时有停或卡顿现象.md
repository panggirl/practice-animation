# 旋转动画(RotateAnimation)无限旋转每圈结束时有停或卡顿现象
### 分析
用 imageview 控件实现无限循环旋转时出现停顿现象是由于动画集合所采用的插值器，差值器影响动画的速度，
默认为 @android:anim/accelerate_decelerate_interpolator,即加速减速插值器

### 方案
使用匀速插值器即：LinearInterpolator 
