package com.example.busschedule

import com.example.busschedule.data.ScheduleDatabase
import android.app.Application

class BusScheduleApplication: Application() {
    val database: ScheduleDatabase by lazy {
        ScheduleDatabase.getDatabase(this)
    }
}
