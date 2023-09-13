package com.thisvyx.healthkatonreminder.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thisvyx.healthkatonreminder.R

class InformasiObatAdapter(): RecyclerView.Adapter<InformasiObatAdapter.InformasiObatViewHolder>() {

    class InformasiObatViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val namaObat: TextView = view.findViewById(R.id.nama_obat)
        val informasiKegunaanObat: TextView = view.findViewById(R.id.informasi_kegunaan_obat)
        val indikasiUmum: TextView = view.findViewById(R.id.indikasi_umum)
        val aturanPakai: TextView = view.findViewById(R.id.aturan_pakai)
        val efekSamping: TextView = view.findViewById(R.id.efek_samping)
        val kontraindikasi: TextView = view.findViewById(R.id.kontraindikasi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InformasiObatViewHolder {
        return InformasiObatViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.informasi_obat_adapter, parent, false)
        )
    }

    override fun getItemCount() = 5

    override fun onBindViewHolder(holder: InformasiObatViewHolder, position: Int) {
        holder.namaObat.text = "Intunal"
        holder.informasiKegunaanObat.text = "INTUNAL F TABLET merupakan obat yang mengandung Pracetamol yang bekerja membantu menurunkan demam dan pereda nyeri."
        holder.indikasiUmum.text = "Gejala flu seperti: demam, pusing, bersin-bersin, hidung tersumbat yang disertai batuk berdahak"
        holder.aturanPakai.text = "3 kali sehari 1 tablet | sesudah makan"
        holder.efekSamping.text = "Gangguan GI, mengantuk, pusing, mulut kering, sulit berkemih, berkeringat, menurunkan nafsu makan, serangan seperti epilepsi (dosis tinggi)."
        holder.kontraindikasi.text = "Hipersensitif, hipertiroid, hipertensi, penyakit jantung, terapi MAOI, nefropati "

    }
}