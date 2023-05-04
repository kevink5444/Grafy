package com.kelompok4.grafy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView

class PilihLevelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih_level)

        val tombolHome = findViewById<CardView>(R.id.tombolhome)
        tombolHome.setOnClickListener{
            val Intent = Intent(this,HomeActivity::class.java)
            startActivity(Intent)
        }

        val levelSatu = findViewById<CardView>(R.id.level_satu)
        levelSatu.setOnClickListener{
            val Intent = Intent(this,level1::class.java)
            startActivity(Intent)
        }

        val beliKoin = findViewById<ImageView>(R.id.koin)
        beliKoin.setOnClickListener{
            val Intent = Intent(this,CoinShop::class.java)
            startActivity(Intent)
        }

        val cekProfil = findViewById<ImageView>(R.id.icon)
        cekProfil.setOnClickListener{
            val Intent = Intent(this,Profil::class.java)
            startActivity(Intent)
        }
    }
}