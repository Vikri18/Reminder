package com.thisvyx.healthkatonreminder.uipasien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thisvyx.healthkatonreminder.R
import com.thisvyx.healthkatonreminder.adapter.RiwayatPenyakitAdapter

class RiwayatPenyakitActivity : AppCompatActivity() {

    lateinit var riwayatPenyakitAdapter: RiwayatPenyakitAdapter
    private  lateinit var listRiwayat: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat_penyakit)

        riwayatPenyakitAdapter = RiwayatPenyakitAdapter()

        listRiwayat = findViewById(R.id.listriwayat)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        listRiwayat.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = riwayatPenyakitAdapter
        }
    }
}