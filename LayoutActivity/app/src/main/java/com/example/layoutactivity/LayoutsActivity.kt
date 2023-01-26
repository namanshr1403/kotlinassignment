package com.example.layoutactivity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class LayoutsActivity : Activity() {
    /**
     * Called when the activity is first created.
     */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create UI Nodes/Objects e.g. Buttons, TextView etc..
        // Create View Hierarchy i.e. View Tree
        // Initialise UI
        // Set The ContentView To Initialised UI
        setContentView(R.layout.main)

        // findViewById Will Search View In View Hierarchy i.e. View Tree
        val l = findViewById<View>(R.id.linearButton) as Button
        val r = findViewById<View>(R.id.relativeButton) as Button
        val g = findViewById<View>(R.id.gridbutton) as Button
        val t = findViewById<View>(R.id.t) as Button
        l.setOnClickListener { // Creating Intent Object
            // Intent is Message
            //      From    : LayoutActivity
            //      To      : LinearLayoutActivity

            // startActivity Method Will Send Intent
            startActivity(
                Intent(
                    this@LayoutsActivity,
                    LinearLayoutActivity::class.java
                )
            )
        }
        r.setOnClickListener {
            startActivity(
                Intent(
                    this@LayoutsActivity,
                    RelativeLayoutActivity::class.java
                )
            )
        }
        g.setOnClickListener {
            startActivity(
                Intent(
                    this@LayoutsActivity,


                    GridLayoutActivity::class.java
                )
            )
        }
        t.setOnClickListener {
            val toast = Toast.makeText(applicationContext, "Hello", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}