package com.example.marblemaze

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StartActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_activity)

        var arraylist: ArrayList<String> = ArrayList()

        arraylist.add("Level 1")
        arraylist.add("Level 2")
        arraylist.add("Level 3")

        recyclerView = findViewById<RecyclerView>(R.id.recycle_levels)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DashboardAdapter(this, arraylist)

    }

    class DashboardAdapter(val activity: StartActivity, val list: ArrayList<String>) :
            RecyclerView.Adapter<DashboardAdapter.ViewHolder>() {
        override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
            return ViewHolder(LayoutInflater.from(activity).inflate(R.layout.levels_page, p0, false))
        }

        override fun getItemCount(): Int {
            return list.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.levelTextName.setText(list[position])
        }

        class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
            val levelImage = v.findViewById<ImageView>(R.id.levelImage)
            val levelTextName = v.findViewById<EditText>(R.id.levelTextName)!!
            val startLevelButton = v.findViewById<Button>(R.id.startLvlButton)

        }
    }


}