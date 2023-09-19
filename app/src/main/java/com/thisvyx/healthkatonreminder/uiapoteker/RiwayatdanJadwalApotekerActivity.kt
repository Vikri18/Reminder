package com.thisvyx.healthkatonreminder.uiapoteker

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.thisvyx.healthkatonreminder.R
import com.thisvyx.healthkatonreminder.adapter.ApotekerRiwayatdanJadwalAdapter
import com.thisvyx.healthkatonreminder.databinding.ActivityRiwayatdanJadwalApotekerBinding

class RiwayatdanJadwalApotekerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRiwayatdanJadwalApotekerBinding
    lateinit var riwayatDanJadwalAdapter: ApotekerRiwayatdanJadwalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRiwayatdanJadwalApotekerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCreate.setOnClickListener{
            startActivity(Intent(this, ApotekerFormRiwayatActivity::class.java))
        }

        riwayatDanJadwalAdapter = ApotekerRiwayatdanJadwalAdapter()
        setupRecyclerView()


    }
    private fun setupRecyclerView() {
        binding.listjadwalriwayat.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = riwayatDanJadwalAdapter
        }
    }
}