package com.thisvyx.healthkatonreminder.database

import androidx.room.Entity

@Entity(tableName = "table_penyakit")
data class Penyakit(
    val id: Int,
    val nama_penyakit: String,
    val tanggal: String
)
