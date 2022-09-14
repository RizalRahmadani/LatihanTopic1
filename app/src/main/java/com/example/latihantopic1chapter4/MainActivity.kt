package com.example.latihantopic1chapter4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var rvBerita : RecyclerView
    lateinit var adapterBerita: AdapterBerita
    lateinit var beritaVm : BeritaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataBerita()
        beritaVm = ViewModelProvider(this).get(BeritaViewModel::class.java)
        beritaVm.getBerita()
        beritaVm.beritaList.observe(this,{
            adapterBerita.setDataBerita(it as ArrayList<DataClassBerita>)
        })

        adapterBerita.onClick = {
            val pindah = Intent(this, IsiBeritaActivity::class.java)
            pindah.putExtra("isiBerita", it)
            startActivity(pindah)
        }


    }


    fun dataBerita(){
        rvBerita = findViewById(R.id.rvBerita)
        adapterBerita = AdapterBerita(ArrayList())
        rvBerita.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvBerita.adapter = adapterBerita

    }
}