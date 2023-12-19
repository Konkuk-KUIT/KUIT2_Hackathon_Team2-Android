package com.example.kuit_hackerton.remote

import com.google.gson.annotations.SerializedName

data class BaseResponse<T> (
    @SerializedName("code") val code: Int,
    @SerializedName("status") val status: String,
    @SerializedName("message") val message: String,
    @SerializedName("result") val result: T
)
