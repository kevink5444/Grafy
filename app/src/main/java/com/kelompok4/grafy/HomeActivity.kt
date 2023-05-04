package com.kelompok4.grafy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val belajarMenulis = findViewById<CardView>(R.id.belajarmenulis)
        belajarMenulis.setOnClickListener{
            val Intent = Intent(this,PilihLevelActivity::class.java)
            startActivity(Intent)
        }

        val menulisDiKertas = findViewById<CardView>(R.id.menulisdikertas)
        menulisDiKertas.setOnClickListener{
            val Intent = Intent(this,PilihLevelActivity::class.java)
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