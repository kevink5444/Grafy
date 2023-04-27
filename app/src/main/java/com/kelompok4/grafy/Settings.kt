package com.kelompok4.grafy
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Settings : AppCompatActivity() {

    val photo1: String=""
    val bagian: String=""
    val deskripsi: String=""
    private lateinit var tvText: TextView
    private lateinit var navigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        init()
        navigationListener()
        class Settings(val bagian: String = "",val deskripsi: String = "",val photo1: String="" )
        var listview = findViewById<ListView>(R.id.listview1)
        var list = mutableListOf<Settings>()

        list.add(Settings("Kecerahan","Atur Kecerahan Layarmu Agar Tidak Membuat Matamu Kelelahan","R.drawable.ic_brightness"))
        list.add(Settings("Kontras","Atur Kontras Layar Sesuai Dengan Kenyamananmu","R.drawable.ic_contrass"))
        list.add(Settings("Ubah Maskot","Pilih Maskot Favoritmu Yang Akan Menyemangatimu","R.drawable.horse"))
        list.add(Settings("Ubah Tampilan","Atur Tampilan Yang Menarik Seperti Yang Kamu Inginkan","R.drawable.tampilan"))
    }

    private fun init() {
        tvText = findViewById(R.id.tv_text)
        navigation = findViewById(R.id.navigation)
    }

    private fun navigationListener() {
        navigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    tvText.text = item.title
                    return@setOnItemSelectedListener true
                }
                R.id.nav_notifikasi -> {
                    tvText.text = item.title
                    return@setOnItemSelectedListener true
                }
                R.id.nav_shop -> {
                    tvText.text = item.title
                    return@setOnItemSelectedListener true
                }
                R.id.nav_setting -> {
                    tvText.text = item.title
                    return@setOnItemSelectedListener true
                }
            }
            false
        }

    }
}