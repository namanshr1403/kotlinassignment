package com.example.flowercustomelist

import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
class MainActivity : AppCompatActivity() {
    val language = arrayOf<String>("Bluewater","Hibiscus","Jasmine","Lavendar","Lotus","Rose","Sunflower","Tulip")
    val description = arrayOf<String>(
       )

    val imageId = arrayOf<Int>(
        R.drawable.bluewater,R.drawable.hibisicus,R.drawable.jasmine,R.drawable.lavendar,R.drawable.lotus,R.drawable.rose,R.drawable.sunflower,R.drawable.tulip
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById(R.id.listView) as ListView
        val myListAdapter = MyListAdapter(this,language,description,imageId)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
        }
    }

}