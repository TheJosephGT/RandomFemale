package com.example.randomperson.data.remote

import com.example.randomperson.data.remote.dto.PersonDTO
import retrofit2.http.GET
import retrofit2.http.Query

data class Response(
    val results: List<PersonDTO>,
    val info: Info
)

data class Info(
    val seed: String,
    val results: Int,
    val page: Int,
    val version: String
)

interface PersonApi {
    @GET("api/")
    suspend fun getRandomUsers(
        @Query("gender") gender: String,
        @Query("page") page: Int,
        @Query("results") results: Int,
        @Query("seed") seed: String
    ): Response
}
