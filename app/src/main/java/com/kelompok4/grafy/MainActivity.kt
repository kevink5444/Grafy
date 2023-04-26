package com.kelompok4.grafy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var button1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)
        button1.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button1 ->{
                val intent = Intent(this@MainActivity,Settings::class.java)
                startActivity(intent)
            }
        }
    }


}
