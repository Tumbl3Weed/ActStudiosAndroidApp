package com.example.myapplication.data.model

import java.time.LocalDateTime

data class Attendance(
    val attended : Boolean,
    val dateTime : LocalDateTime
)
