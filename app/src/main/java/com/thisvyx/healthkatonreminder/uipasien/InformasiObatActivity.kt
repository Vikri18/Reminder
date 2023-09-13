package com.thisvyx.healthkatonreminder.uipasien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thisvyx.healthkatonreminder.R
import com.thisvyx.healthkatonreminder.adapter.InformasiObatAdapter

class InformasiObatActivity : AppCompatActivity() {


    lateinit var informasiObatAdapter: InformasiObatAdapter
    private lateinit var listInformasiObat: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi_obat)

        informasiObatAdapter = InformasiObatAdapter()

        listInformasiObat = findViewById(R.id.list_informasi_obat)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        listInformasiObat.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = informasiObatAdapter
        }
    }
}