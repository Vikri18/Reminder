package com.thisvyx.healthkatonreminder.autentikasi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.thisvyx.healthkatonreminder.R
import com.thisvyx.healthkatonreminder.uiapoteker.MenuApotekerActivity
import com.thisvyx.healthkatonreminder.uipasien.MenuPasienActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLoginPasien = findViewById<Button>(R.id.btn_login_pasien)
        btnLoginPasien.setOnClickListener {
            startActivity(Intent(this, MenuPasienActivity::class.java))
            finish()
            Toast.makeText(
                this@LoginActivity,
                "Login Berhasil",
                Toast.LENGTH_SHORT
            ).show()
        }

        val btnLoginApoteker = findViewById<Button>(R.id.btn_login)
        btnLoginApoteker.setOnClickListener {
            startActivity(Intent(this, MenuApotekerActivity::class.java))
            finish()
            Toast.makeText(
                this@LoginActivity,
                "Login Berhasil",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}