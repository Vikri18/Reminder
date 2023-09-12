package com.thisvyx.healthkatonreminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thisvyx.healthkatonreminder.uiapoteker.MenuApotekerActivity
import com.thisvyx.healthkatonreminder.uipasien.MenuPasienActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(
            Intent(this, MenuPasienActivity::class.java)
        )
    }
}