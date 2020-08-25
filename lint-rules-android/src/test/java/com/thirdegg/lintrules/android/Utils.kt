package com.thirdegg.lintrules.android

import java.io.File

object Utils {

    fun getSdk(): File {
        //  TestUtils.getSdk() not working
        return if (System.getProperty("os.name").startsWith("Windows")) {
            File(System.getenv("LOCALAPPDATA")+"\\Android\\Sdk")
        } else {
            File(System.getProperty("user.home")+"/Android/Sdk/")
        }
    }

}