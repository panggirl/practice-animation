package com.dabo.practiceanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_test.*

/**
 * Created by @author dabo on 2019/3/15.
 */
class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        logDebug.text = "当前是否是测试包 ${BuildConfig.LOG_DEBUG}"

        baseUrl.text = "该包的 baseURL = ${BuildConfig.BASE_URL}"

    }
}