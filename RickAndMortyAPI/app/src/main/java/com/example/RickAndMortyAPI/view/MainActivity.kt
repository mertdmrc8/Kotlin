package com.example.RickAndMortyAPI.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.RickAndMortyAPI.model.RickAndMortyModel
import com.example.RickAndMortyAPI.service.RickAndMortyApi
import com.example.RickAndMortyAPI.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.row_layout.view.*

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private val BASE_URL = "https://rickandmortyapi.com/api/"
    private var RickAndMortyModels: ArrayList<RickAndMortyModel>? = null
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

       // Glide.with(this).load("https://rickandmortyapi.com/api/character/avatar/2.jpeg").into(binding.imageView)

    loadData()

    }

    private fun loadData() {
        println("fonksiyon çalıştı")
        val retrofit =
            Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .build()

        val service = retrofit.create(RickAndMortyApi::class.java)
        val call = service.getData()

        call.enqueue(object : Callback<RickAndMortyModel> {


            override fun onResponse(
                call: Call<RickAndMortyModel>,
                response: Response<RickAndMortyModel>
            ) {
                println("yanıt geldi")
                println(response)
                if (response.isSuccessful) {
                    println("response success")
                    response.body()?.let {
                        //println(it)
                        println(response.body()!!.name)



                    } ?: println("response body null")
                }else{
                    println("response not success")
                }
            }


            override fun onFailure(call: Call<RickAndMortyModel>, t: Throwable) {
                t.printStackTrace()
                println("Hata!! -> ${t}")


            }

        })
    }


}
