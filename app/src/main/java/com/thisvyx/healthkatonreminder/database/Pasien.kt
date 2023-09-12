package com.thisvyx.healthkatonreminder.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "table_pasien")
data class Pasien (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val nama_pasien: String,
    val noTelp: String,
    val alamat: String

)