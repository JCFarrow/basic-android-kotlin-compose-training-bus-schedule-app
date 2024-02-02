package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ScheduleDao {
    @Query("SELECT * FROM schedule ORDER BY arrivalTimeInMillis")
    fun getSchedule(): Flow<List<BusSchedule>>

    @Query("SELECT * FROM schedule WHERE stopName = :stopName ORDER BY arrivalTimeInMillis")
    fun getStopSchedule(stopName: String): Flow<List<BusSchedule>>
}