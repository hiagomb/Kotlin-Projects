package com.example.retrofit

import com.google.gson.annotations.SerializedName

class PostEntity {

    @SerializedName("userId")
    var userId = 0

    @SerializedName("id")
    var id = 0

    @SerializedName("title")
    var title = ""

    @SerializedName("body")
    var body = ""

}