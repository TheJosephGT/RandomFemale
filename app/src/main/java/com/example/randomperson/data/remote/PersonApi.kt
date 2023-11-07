package com.example.randomperson.data.remote

import com.example.randomperson.data.remote.dto.PersonDTO
import com.example.randomperson.data.remote.dto.results
import retrofit2.http.GET
import retrofit2.http.Query


interface PersonApi {
    @GET("api/?gender=female&?page=3&results=10&seed=abc")
    suspend fun getPersons(): results
}
