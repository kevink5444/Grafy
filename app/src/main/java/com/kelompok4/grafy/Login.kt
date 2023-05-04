package com.kelompok4.grafy

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Login : AppCompatActivity(), View.OnClickListener {
    private lateinit var button1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        button1 = findViewById(R.id.button1)
        button1.setOnClickListener(this)


    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.button1 -> {
                val homeactivity = Intent(this@Login, HomeActivity::class.java)
                startActivity(homeactivity)
            }
            }
    }
}




