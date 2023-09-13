package com.thisvyx.healthkatonreminder.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thisvyx.healthkatonreminder.R
import org.w3c.dom.Text

class JadwalAdapter (): RecyclerView.Adapter<JadwalAdapter.JadwalViewHolder>() {

    class JadwalViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val waktuObat: TextView = view.findViewById(R.id.waktu_obat)
        val namaObat: TextView = view.findViewById(R.id.nama_obat)
        val keteranganSakit : TextView = view.findViewById(R.id.keterangan_sakit)
        val aturanPakai: TextView = view.findViewById(R.id.aturan_pakai)
        val countDown: TextView = view.findViewById(R.id.keterangan_waktu)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JadwalViewHolder {
        return JadwalViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.jadwal_adapter, parent,false)
        )
    }

    override fun getItemCount() = 5

    override fun onBindViewHolder(holder: JadwalViewHolder, position: Int) {

        holder.waktuObat.text = "07:00"
        holder.namaObat.text = "Intunal | "
        holder.keteranganSakit.text = "flu | batuk | demam"
        holder.aturanPakai.text = "1 Tablet | Sesudah Makan"
        holder.countDown.text = "Alarm Dalam 1 Jam 20 menit"

    }


}

// jam
// nama obat
// keterangan aturan pakai
// hitung mundur waktu