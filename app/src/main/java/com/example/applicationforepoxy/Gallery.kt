package com.example.applicationforepoxy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.epoxy.EpoxyRecyclerView
import com.example.applicationforepoxy.adapters.CatAdapters
import com.example.applicationforepoxy.model.CatGallery

class Gallery : AppCompatActivity() {

    private var epoxyRecyclerView:EpoxyRecyclerView? = null
    private var gridLayoutManager:GridLayoutManager ? = null
    private var arrayList:ArrayList<CatGallery> ? = null
    private var catAdapters:CatAdapters ? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        epoxyRecyclerView = findViewById(R.id.epoxy_Recyclerview)
        gridLayoutManager =
            GridLayoutManager(applicationContext , 3 , LinearLayoutManager.VERTICAL, false)
        epoxyRecyclerView?.layoutManager = gridLayoutManager
        epoxyRecyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList()
        catAdapters = CatAdapters(applicationContext , arrayList!!)
        epoxyRecyclerView?.adapter = catAdapters
    }

    private fun setDataInList() :ArrayList<CatGallery>{

        var items:ArrayList<CatGallery> = ArrayList()

        items.add(CatGallery(R.drawable.ic_0, "Adorable"))
        items.add(CatGallery(R.drawable.ic_1, "Elegant"))
        items.add(CatGallery(R.drawable.ic_2, "Fluffy"))
        items.add(CatGallery(R.drawable.ic_3, "Guardian"))
        items.add(CatGallery(R.drawable.ic_4, "Sporty"))
        items.add(CatGallery(R.drawable.ic_5, "Fancy"))
        items.add(CatGallery(R.drawable.ic_6, "Silly"))
        items.add(CatGallery(R.drawable.ic_7, "Cutie"))
        items.add(CatGallery(R.drawable.ic_8, "Weird"))
        items.add(CatGallery(R.drawable.ic_9, "Unique"))

        return items

    }

}