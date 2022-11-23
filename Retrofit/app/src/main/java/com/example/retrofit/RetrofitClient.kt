package com.example.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object{
        private const val BASE_URL = "https://jsonplaceholder.typicode.com/"
        private lateinit var instance: Retrofit

        private fun getRetrofitInstance(): Retrofit{
            if(instance == null){
                val http = OkHttpClient.Builder()
                instance = Retrofit.Builder().baseUrl(BASE_URL).client(http.build()).
                addConverterFactory(GsonConverterFactory.create()).build()
            }

            return instance
        }

        fun createPostService(): PostService{
            return getRetrofitInstance().create(PostService::class.java)
        }
    }
}