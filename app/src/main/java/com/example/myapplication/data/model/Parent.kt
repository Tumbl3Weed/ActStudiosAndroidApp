package com.example.myapplication.data.model

data class Parent(
    val id:Long,
    val name:String,
    val surname: String,
    val children : Student,
    val school: School,
)
