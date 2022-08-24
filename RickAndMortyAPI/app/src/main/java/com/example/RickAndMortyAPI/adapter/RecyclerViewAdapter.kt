package com.example.RickAndMortyAPI.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.RickAndMortyAPI.R
import com.example.RickAndMortyAPI.model.RickAndMortyModel

class RecyclerViewAdapter(val CharacterList: ArrayList<RickAndMortyModel>,val context: Context):
RecyclerView.Adapter<CharacterListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterListViewHolder {
val view= LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false)
return CharacterListViewHolder(view, context)
    }

    override fun onBindViewHolder(holder: CharacterListViewHolder, position: Int) {



    }

    override fun getItemCount(): Int {
        return CharacterList.count()

    }


}