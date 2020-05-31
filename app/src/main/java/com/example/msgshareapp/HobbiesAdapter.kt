package com.example.msgshareapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
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
        holder.setData(hobby)
    }

    inner class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        //if a var property value i not null use !! instead of ?. for mor info visit: https://agrawalsuneet.github.io/blogs/safe-calls-vs-null-checks-in-kotlin/
        fun setData(hobby: Hobby?){
            itemView.txvTitle.text = hobby!!.title
        }

    }
}