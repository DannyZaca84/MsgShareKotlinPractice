package com.example.msgshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//

        btnShowToast.setOnClickListener {
            //Code
            Log.i(
                "MainActivity",
                "Button was clicked My Friend !"
            ) //This statement is to specify the functionality of the code, it will register onto the LogCat Tab

            //toast Statement
            Toast.makeText(this, "Button Was Clicked !", Toast.LENGTH_SHORT).show()


        }
    }
}