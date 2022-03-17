package com.example.myapplication.data.model

data class Student(
    val id : Long,
    val name: String,
    val surname: String,
    val parent : Parent,
    val notes : Note,
    val attendance: Attendance,
)
