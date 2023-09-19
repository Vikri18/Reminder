package com.thisvyx.healthkatonreminder.uiapoteker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thisvyx.healthkatonreminder.R
import com.thisvyx.healthkatonreminder.databinding.ActivityMenuApotekerBinding

class MenuApotekerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuApotekerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuApotekerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.MenuObat.setOnClickListener {
            startActivity(Intent(this, ApotekerObatActivity::class.java))
        }

        binding.MenuRiwayatKesehatan.setOnClickListener {
            startActivity((Intent(this, RiwayatdanJadwalApotekerActivity::class.java)))
        }

    }
}