package com.example.layoutactivity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class RelativeLayoutActivity : Activity() {
    /**
     * Called when the activity is first created.
     */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout)
        val OKay = findViewById<View>(R.id.ik) as Button
        OKay.setOnClickListener { //                Toast toast=Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_LONG);
            //                toast.show();
            startActivity(Intent(this@RelativeLayoutActivity, LayoutsActivity::class.java))
        }
    }
}