package com.example.latihantopic1chapter4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class AdapterBerita (var listBerita : ArrayList<DataClassBerita>) : RecyclerView.Adapter<AdapterBerita.ViewHolder>(){

    var onClick :((DataClassBerita)-> Unit)? = null

    class ViewHolder(view : View):RecyclerView.ViewHolder(view){
        var imgBerita = view.findViewById<ImageView>(R.id.imgBerita)
        var judul = view.findViewById<TextView>(R.id.txtJudulBerita)
        var jurnalis = view.findViewById<TextView>(R.id.txtJurnalisItem)
        var tanggal = view.findViewById<TextView>(R.id.txtTanggalBerita)
        var card = view.findViewById<CardView>(R.id.cardView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_berita, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgBerita.setImageResource(listBerita[position].img)
        holder.judul.text = listBerita[position].judul
        holder.jurnalis.text = listBerita[position].Jurnalis
        holder.tanggal.text= listBerita[position].tanggal
        holder.card.setOnClickListener{
            onClick?.invoke(listBerita[position])
        }
    }

    override fun getItemCount(): Int {
        return listBerita.size
    }

    fun setDataBerita(beritaList : ArrayList<DataClassBerita>){
        this.listBerita= beritaList
    }
}