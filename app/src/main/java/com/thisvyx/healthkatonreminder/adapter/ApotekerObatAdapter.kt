package com.thisvyx.healthkatonreminder.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thisvyx.healthkatonreminder.R

class ApotekerObatAdapter(): RecyclerView.Adapter<ApotekerObatAdapter.ApotekerObatViewHolder>() {

    class ApotekerObatViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val judul : TextView = view.findViewById(R.id.judul)
        val namaObat: TextView = view.findViewById(R.id.nama_obat)
        val btnEdit: ImageButton = view.findViewById(R.id.icon_edit)
        val btnDelete: ImageButton = view.findViewById(R.id.icon_delete)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApotekerObatViewHolder {
        return ApotekerObatViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_obat_apoteker,parent, false)
        )
    }

    override fun getItemCount()= 10

    override fun onBindViewHolder(holder: ApotekerObatViewHolder, position: Int) {
        holder.judul.text = "Nama Obat : "
        holder.namaObat.text = "Intunal"
    }
}