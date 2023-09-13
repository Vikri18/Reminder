package com.thisvyx.healthkatonreminder.uipasien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thisvyx.healthkatonreminder.R
import com.thisvyx.healthkatonreminder.adapter.JadwalAdapter

class JadwalActivity : AppCompatActivity() {

    lateinit var jadwalAdapter: JadwalAdapter
    private lateinit var listJadwal: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jadwal)

        jadwalAdapter = JadwalAdapter()

         listJadwal = findViewById(R.id.listjadwal)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {


        listJadwal.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = jadwalAdapter
        }
    }
}