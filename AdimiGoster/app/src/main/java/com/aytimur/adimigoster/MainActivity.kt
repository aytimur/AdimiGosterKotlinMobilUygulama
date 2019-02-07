package com.aytimur.adimigoster

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Buradan itibaren programımızın kodlarını oluşturuyoruz.
        BtnGoster.setOnClickListener {
            gostertext.text = adSoyad.text
            adSoyad.text.clear()
        }
    }
}
