package com.junior.EXC2.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelp {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://run.mocky.io/v3/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val cinenoteService: CinenoteService= retrofit.create(CinenoteService::class.java)

}





//chuck
//https://run.mocky.io/v3/e7ff1bce-4a9a-4cbe-9e19-423f53c91b36