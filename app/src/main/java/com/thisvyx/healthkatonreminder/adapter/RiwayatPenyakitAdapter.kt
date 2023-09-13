package com.thisvyx.healthkatonreminder.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thisvyx.healthkatonreminder.R
import org.w3c.dom.Text

class RiwayatPenyakitAdapter (): RecyclerView.Adapter<RiwayatPenyakitAdapter.RiwayatPenyakitViewHolder>(){
    class RiwayatPenyakitViewHolder (view: View): RecyclerView.ViewHolder(view){
        val tanggal: TextView = view.findViewById(R.id.tgl_pengobatan)
        val namaApoteker: TextView = view.findViewById(R.id.nama_apoteker)
        val sakit: TextView = view.findViewById(R.id.nama_penyakit)
        val namaObat: TextView = view.findViewById(R.id.nama_obat)
        val namaVitamin: TextView = view.findViewById(R.id.nama_vitamin)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RiwayatPenyakitViewHolder {
        return RiwayatPenyakitViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.riwayat_adapter, parent, false)
        )
    }

    override fun getItemCount() = 5

    override fun onBindViewHolder(holder: RiwayatPenyakitViewHolder, position: Int) {
        holder.tanggal.text = "01/05/2023"
        holder.namaApoteker.text= "Susanti Aprlilia Putri"
        holder.sakit.text = "Lambung | Demam | Flu | Batuk"
        holder.namaObat.text = "Intunal | Omeprazole"
        holder.namaVitamin.text = "Caviplex"
    }
}