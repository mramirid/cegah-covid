package com.mramirid.cegahcovid_19.model

data class CheckupQuestion(
    val id: Int,
    val question: String,
    var answer: Boolean,
    var hasAnswered: Boolean
)