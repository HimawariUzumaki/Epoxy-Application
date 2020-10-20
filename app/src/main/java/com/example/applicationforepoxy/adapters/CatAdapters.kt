package com.example.applicationforepoxy.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.epoxy.EpoxyRecyclerView
import com.example.applicationforepoxy.R
import com.example.applicationforepoxy.model.CatGallery

class CatAdapters (var context: Context , var arrayList: ArrayList<CatGallery>) :
    RecyclerView.Adapter<CatAdapters.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

        val itemHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_layout_items, parent , false)
        return ItemHolder(itemHolder)


    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        var iconsChar:CatGallery = arrayList.get(position)

        holder.icons.setImageResource(iconsChar.iconsChar!!)
        holder.cat.text = iconsChar.catGallery

        holder.cat.setOnClickListener{
            Toast.makeText(context , iconsChar.catGallery , Toast.LENGTH_LONG).show()
        }

    }

    override fun getItemCount(): Int {
       return arrayList.size
    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var icons = itemView.findViewById<ImageView>(R.id.icons_image)
        var cat = itemView.findViewById<TextView>(R.id.cat_textView)


    }
}