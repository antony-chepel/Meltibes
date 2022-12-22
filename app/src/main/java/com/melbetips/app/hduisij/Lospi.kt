package com.melbetips.app.hduisij

import android.app.Application
import com.appsflyer.AppsFlyerLib

class Lospi : Application() {
    override fun onCreate() {
        super.onCreate()
        AppsFlyerLib.getInstance().init("6zrXofgemB6eiuGR7DWZ3K", null, this)
        AppsFlyerLib.getInstance().start(this)
    }
}