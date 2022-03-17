package com.example.myapplication.data.model

import android.accounts.Account
import java.time.LocalDateTime

data class Note(
    val text : String,
    val dateTime: LocalDateTime,
    val noteCreator: Account
)
