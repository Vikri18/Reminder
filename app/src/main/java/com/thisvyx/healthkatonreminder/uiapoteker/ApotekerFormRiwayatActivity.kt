package com.thisvyx.healthkatonreminder.uiapoteker

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.thisvyx.healthkatonreminder.R
import com.thisvyx.healthkatonreminder.databinding.ActivityApotekerFormRiwayatBinding

class ApotekerFormRiwayatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityApotekerFormRiwayatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApotekerFormRiwayatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSave.setOnClickListener{
            startActivity(
                Intent(
                this, InputJadwalActivity::class.java
            ))
            finish()
            Toast.makeText(
                this@ApotekerFormRiwayatActivity,
                "data berhasil disimpan",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}