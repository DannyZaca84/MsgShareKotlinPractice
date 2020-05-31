package com.example.msgshareapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity  : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //attache a layout to it
        setContentView(R.layout.activity_hobbies)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
        //now, initialize the hobbies Adapter
        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        recyclerView.adapter = adapter
        //attach the layoutManager to the recyclerView








    }

    //after creating an activity, add it to the AndroidManifest.xml file
}

