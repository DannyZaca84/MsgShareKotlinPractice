package com.example.msgshareapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HobbiesActivity  : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //attache a layout to it
        setContentView(R.layout.activity_hobbies)
    }

    //after creating an activity, add it to the AndroidManifest.xml file
}

