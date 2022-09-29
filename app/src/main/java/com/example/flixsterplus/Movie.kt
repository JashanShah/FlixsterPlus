package com.example.flixsterplus

import com.google.gson.annotations.SerializedName

class Movie {
    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("poster_path")
    var moviePosterUrl: String? = null

    @SerializedName("overview")
    var overview: String? = null

}