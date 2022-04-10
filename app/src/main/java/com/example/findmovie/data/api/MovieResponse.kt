package com.example.findmovie.data.api

import com.example.findmovie.data.model.Movie

data class MovieResponse(
    val results: List<Movie>,
)