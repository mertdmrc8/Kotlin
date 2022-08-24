package com.example.RickAndMortyAPI.adapter
import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.RickAndMortyAPI.model.RickAndMortyModel
import kotlinx.android.synthetic.main.row_layout.view.*
import retrofit2.Response

class CharacterListViewHolder(view : View, val context: Context): RecyclerView.ViewHolder(view) {
    fun bind(itemModel : RickAndMortyModel) {
itemView.imageview
        Glide.with(context).load("https://rickandmortyapi.com/api/character/avatar/2.jpeg").into(itemView.imageview)



    }
}