package com.thisvyx.healthkatonreminder.uipasien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import com.thisvyx.healthkatonreminder.R

class MenuPasienActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_pasien)

        val btnDetailInformasiObat = findViewById<TextView>(R.id.tv_lihat_jadwal)
        btnDetailInformasiObat.setOnClickListener {
            startActivity(Intent(this, JadwalActivity::class.java))
        }

        val btnInformasiObat = findViewById<LinearLayout>(R.id.ln_informasi_obat)

        btnInformasiObat.setOnClickListener {
            startActivity(Intent(this, InformasiObatActivity::class.java))
        }

        val btnRiwayatPenyakit = findViewById<LinearLayout>(R.id.ln_riwayat_penyakit)
        btnRiwayatPenyakit.setOnClickListener {
            startActivity(Intent(this, RiwayatPenyakitActivity::class.java))
        }

        val btnJadwalMinumObat = findViewById<LinearLayout>(R.id.ln_jadwal_minum_obat)
        btnJadwalMinumObat.setOnClickListener {
            startActivity(Intent(this, JadwalActivity::class.java))
        }
    }
}