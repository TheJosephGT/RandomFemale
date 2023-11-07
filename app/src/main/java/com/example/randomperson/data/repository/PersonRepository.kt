package com.example.randomperson.data.repository

import com.example.randomperson.data.remote.PersonApi
import com.example.randomperson.data.remote.dto.PersonDTO
import com.example.randomperson.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.util.UUID
import javax.inject.Inject

class PersonRepository @Inject constructor(private val api: PersonApi) {
    fun getPerson(): Flow<Resource<List<PersonDTO>>> = flow {
        try{
            emit(Resource.Loading())

            val person = api.getPersons()

            emit(Resource.Success(person.results))
        }catch (e: HttpException){
            emit(Resource.Error(e.message ?: "Error HTTP"))

        }catch (e: IOException){
            emit(Resource.Error(e.message ?: "Verificar conexion"))
        }
    }
}