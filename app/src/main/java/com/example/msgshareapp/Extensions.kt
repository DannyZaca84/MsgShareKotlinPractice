package com.example.msgshareapp


import android.content.Context
import android.widget.Toast

//Example of the extension function
// If a toast message needs to be repeated, the extension function helps reduce the amount of lines of code

fun Context.showToast(message: String){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}