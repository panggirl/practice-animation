package com.dabo.practiceanimation.utils

import android.util.Log
import com.dabo.practiceanimation.BuildConfig


object LogUtils {
     var LOG_DEBUG = BuildConfig.LOG_DEBUG

    private val TAG = "tag"
    private val TAG_TEST = "test"

    fun e(tag: String, log: String) {
        if (LOG_DEBUG) {
            Log.e(tag, log)
        }
    }

    fun w(tag: String, log: String) {
        if (LOG_DEBUG) {
            Log.w(tag, log)
        }
    }

    fun d(tag: String, log: String) {
        if (LOG_DEBUG) {
            Log.d("tag", log)
        }
    }

    fun i(tag: String, log: String) {
        if (LOG_DEBUG) {
            Log.i(tag, log)
        }
    }

    fun test(tag: String, msg: String) {
        if (LOG_DEBUG) {
            val message = formatMessage(tag, msg)
            Log.i(TAG_TEST, message)
        }
    }

    private fun formatMessage(tag: String?, msg: String?): String {
        var tag = tag
        var msg = msg
        if (tag == null) {
            tag = ""
        }
        if (msg == null) {
            msg = ""
        }
        var ret = "$tag:$msg"
        ret = "[" + Thread.currentThread().name + "]:" + ret
        return ret
    }
}
