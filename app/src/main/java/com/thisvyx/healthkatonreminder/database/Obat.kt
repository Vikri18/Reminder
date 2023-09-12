package com.thisvyx.healthkatonreminder.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_obat")
data class Obat(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val nama_obat: String,
    val tipe: String,
)
