package com.example.RickAndMortyAPI.service

import com.example.RickAndMortyAPI.model.RickAndMortyModel
import retrofit2.Call
import retrofit2.http.GET

interface RickAndMortyApi {
    //https://rickandmortyapi.com/api/character/96
    @GET("character/2")
    fun getData():Call<RickAndMortyModel>

}