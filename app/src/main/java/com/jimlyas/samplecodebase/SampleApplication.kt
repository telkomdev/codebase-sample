package com.jimlyas.samplecodebase

import android.app.NotificationChannel
import com.devbase.utils.DevApplication
import org.koin.core.module.Module

/**
 * @author jimlyas
 * @since 27-Jul-21
 **/
class SampleApplication : DevApplication() {
    override fun defineKoinModules() = listOf<Module>()

    override fun defineNotificationChannel() = listOf<NotificationChannel>()

    override fun initApplication() {

    }
}