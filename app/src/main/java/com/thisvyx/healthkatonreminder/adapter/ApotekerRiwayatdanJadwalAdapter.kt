package com.thisvyx.healthkatonreminder.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thisvyx.healthkatonreminder.R

class ApotekerRiwayatdanJadwalAdapter() :
    RecyclerView.Adapter<ApotekerRiwayatdanJadwalAdapter.ApotekerRiwayatdanJadwalViewHolder>() {
    class ApotekerRiwayatdanJadwalViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val namaPasien : TextView = view.findViewById(R.id.nama_pasien)
        val judul: TextView = view.findViewById(R.id.judul)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ApotekerRiwayatdanJadwalViewHolder {
        return ApotekerRiwayatdanJadwalViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_riwayat_apoteker,parent, false)
        )
    }

    override fun getItemCount()= 10

    override fun onBindViewHolder(holder: ApotekerRiwayatdanJadwalViewHolder, position: Int) {
        holder.judul.text = "Nama Pasien : "
        holder.namaPasien.text = "Ikhsan Supriadi"
    }


}