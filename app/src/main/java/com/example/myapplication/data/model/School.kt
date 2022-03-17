package com.example.myapplication.data.model

import android.telephony.PhoneNumberUtils

data class School(
    val name :  String,
    val location : String,
    val principal : String,
    val telNumber : PhoneNumberUtils,
    val secretary : String,
    val secretaryNumber : PhoneNumberUtils,
    val classTimes : ActClasses,
)
