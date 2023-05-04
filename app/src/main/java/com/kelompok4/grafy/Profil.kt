package com.kelompok4.grafy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val ubahProfil = findViewById<Button>(R.id.ubahprofil)
        ubahProfil.setOnClickListener{
            val Intent = Intent(this,UbahProfil::class.java)
            startActivity(Intent)
        }
    }
}