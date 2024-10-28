package com.fadhlur.uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StartScreen : AppCompatActivity() {

    private lateinit var btnLogin: Button
    private lateinit var btnSignin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_start_screen)

        btnLogin = findViewById(R.id.btnLogin)
        btnSignin = findViewById(R.id.btnSignin)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLogin.setOnClickListener() {
            val intent = Intent(this@StartScreen, PageLogin::class.java)
            startActivity(intent)
        }

        btnSignin.setOnClickListener() {
            val intent = Intent(this@StartScreen, PageSignin::class.java)
            startActivity(intent)
        }
    }
}