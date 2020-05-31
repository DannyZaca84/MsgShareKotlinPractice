package com.example.msgshareapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter (val context: Context, val hobbies: List<Hobby>) : RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        //return the instance of MyViewHolder class
        return MyViewHolder(view)


    }
//the method below is in charge of getting the length of the items
    override fun getItemCount(): Int {
    return hobbies.size

    }

    //this code binds the data tha is created on the onCreateViewHolder method
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
    val hobby = hobbies[position]
        holder.setData(hobby, position)
    }

    inner class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var currentHobby : Hobby? = null
        var currentPosition : Int = 0

        //activate the action within the hobby list
        init{
            itemView.setOnClickListener {
                Toast.makeText(context, currentHobby!!.title + "  Clicked !", Toast.LENGTH_SHORT).show()
            }
            //activate the "share" icon within the hobbies list, the code is the same as the "share to other applications" from the MainActivity
            itemView.imgShare.setOnClickListener {
                val message: String = "My favorite hobby is: " + currentHobby!!.title

                //there is not need to parse anything, because we don't know where are we going to share the data
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, message)
                intent.type = "text/plain"

                //now, parse the activity
                context.startActivity(Intent.createChooser(intent, "Share to : "))
            }



        }

        //if a var property value i not null use !! instead of ?. for mor info visit: https://agrawalsuneet.github.io/blogs/safe-calls-vs-null-checks-in-kotlin/
        fun setData(hobby: Hobby?, pos: Int){
            itemView.txvTitle.text = hobby!!.title

            this.currentHobby = hobby
            this.currentPosition = pos
        }

    }
}