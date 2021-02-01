package ru.myuniquenickname.myapplication.domain.entity

data class Movie(
    var like: Boolean,
    val id: Long,
    val poster: String,
    val backdrop: String,
    val minimumAge: Int,
    val ratings: Float,
    val title: String,
    val overview: String,
    val numberOfRatings: Long,
    val genres: List<Genre>
)
