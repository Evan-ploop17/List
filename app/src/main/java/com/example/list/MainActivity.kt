package com.example.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruits:ArrayList<Fruit> = ArrayList()
        fruits.add(Fruit("Apple", R.drawable.appl))
        fruits.add(Fruit("Peach", R.drawable.peach))
        fruits.add(Fruit("Banana", R.drawable.banana))
        fruits.add(Fruit("Watermelon", R.drawable.watermelon))

        //var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruits)
        val adapter = AdapterCustom(this, fruits)
        list.adapter = adapter

        list.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, fruits[position].name, Toast.LENGTH_LONG).show()
        }

    }
}