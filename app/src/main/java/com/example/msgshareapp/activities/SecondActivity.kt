package com.example.msgshareapp.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.msgshareapp.R
import com.example.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){

    //type onCreate and select the second parameter with only of saveInstanceState
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //this is how to extract the incoming value from the user_message coming from main activity
     val bundle: Bundle? = intent.extras
        //Bundle? is a nullable
        val msg = bundle!!.getString("user_message")
        //now get the key from the main activity, it must match.
        // "!!" not null assertion operator
        showToast(msg)
        txvUserMessage.text = msg


//Implicit intent


    }


}