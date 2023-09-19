package com.thisvyx.healthkatonreminder.uiapoteker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.thisvyx.healthkatonreminder.R
import com.thisvyx.healthkatonreminder.adapter.ApotekerObatAdapter
import com.thisvyx.healthkatonreminder.databinding.ActivityApotekerObatBinding

class ApotekerObatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityApotekerObatBinding
    private lateinit var obatAdapter: ApotekerObatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApotekerObatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listObat.setOnClickListener{
            startActivity(Intent(
                this, ApotekerEditObatActivity::class.java
            ))
        }

        binding.buttonCreate.setOnClickListener{
            startActivity(
                Intent(this, ApotekerEditObatActivity::class.java)
            )
        }

        obatAdapter = ApotekerObatAdapter()
        setupRecyclerView()
    }
    private fun setupRecyclerView() {
        binding.listObat.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = obatAdapter
        }
    }
}