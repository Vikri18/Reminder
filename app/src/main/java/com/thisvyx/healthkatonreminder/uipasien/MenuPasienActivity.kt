package com.thisvyx.healthkatonreminder.uipasien

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thisvyx.healthkatonreminder.R
import com.thisvyx.healthkatonreminder.adapter.JadwalAdapter

class MenuPasienActivity : AppCompatActivity() {

    lateinit var jadwalAdapter: JadwalAdapter
    private lateinit var listJadwal: RecyclerView
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

        jadwalAdapter = JadwalAdapter()
        listJadwal = findViewById(R.id.list_jadwal)
        setupRecyclerView()
    }


    private fun setupRecyclerView() {


        listJadwal.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = jadwalAdapter
        }
    }
}