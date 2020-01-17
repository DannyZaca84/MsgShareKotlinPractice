package com.example.msgshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//

        btnShowToast.setOnClickListener {
            //Code
            //this is an example on how to register user interaction or activity with the application into the logcat option.
            //it registers any type of interaction with the application.
            Log.i(
                "MainActivity",
                "Button was clicked My Friend !"
            ) //This statement is to specify the functionality of the code, it will register onto the LogCat Tab

            //toast Statement
            Toast.makeText(this, "Button Was Clicked !", Toast.LENGTH_SHORT).show()


        }

        btnSendMsgToNextActivity.setOnClickListener {


            //the concept of get/set has change and now is used as the syntax variable, in this case etUserMessage then just "text" toString.
            // and this is how we parse / get the information from the user using the variable etUserMessage
            val message: String = etUserMessage.text.toString()
            //now, create a new activity so we can navigate from one to another.

            //Intent can be interpreted as the "Intention of doing something"
            //in this case we are intending to navigate to another activity

            //define intent
            //note: when "this" is present, it refers to the content of "THIS" activity

            //concept of kotlin reflexion: ::class.java
            //https://kotlinlang.org/docs/reference/reflection.html
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)//This is an example of explicit intent

            intent.putExtra("user_message",message)

            startActivity(intent)


            //don't forget to declare activity into the AndroidManifest.xml

            //if application crashes, refer to logcat to identify problem

        }
        //video two section five
        //in this section, we are going to share data between activities and the selected app(like facebook, handouts, and so on) choose by the user
        //use the lambda expression
        btnShareToOtherApps.setOnClickListener {

            val message: String = etUserMessage.text.toString()

            //there is not need to parse anything, because we don't know where are we going to share the data
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            //now, parse the activitie
            startActivity(Intent.createChooser(intent, "Share to : "))
            //if the application like gmail are not displayed in the intent, simply download them. the emulator might not have those applications install



        }//end of btnShareToOtherApps


        //Section 3 video 1
        //Implement onClick listener for the Recycler View Demo button
        btnRecyclerViewDemo.setOnClickListener {

            val intent = Intent(this,HobbiesActivity::class.java)
            startActivity(intent)
        }


    }
}