package com.example.recipeuygulamasisara.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeuygulamasisara.R
import com.example.recipeuygulamasisara.data.entity.Yemekler
import com.example.recipeuygulamasisara.databinding.CardTasarimBinding
import com.example.recipeuygulamasisara.ui.fragment.AnasayfaFragment
import com.example.recipeuygulamasisara.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class YemeklerAdapter(var mContext: Context, var yemeklerListesi:List<Yemekler>)
    :RecyclerView.Adapter<YemeklerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) :
        RecyclerView.ViewHolder(tasarim.root)  // kartın üstündeki görsel nesneleri tutar (holder)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding:CardTasarimBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext),R.layout.card_tasarim ,parent,false)
        return CardTasarimTutucu(binding)    //tasarım üzerinde görsel nesnelere ulaşmamızı sağladık
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val yemek = yemeklerListesi.get(position)
        val t = holder.tasarim


        t.imageViewYemek.setImageResource(
            mContext.resources.getIdentifier(yemek.resim, "drawable", mContext.packageName))

        t.yemekNesnesi = yemek

        t.cardViewYemek.setOnClickListener{
            val gecis = AnasayfaFragmentDirections.detayGecis(yemek = yemek)
            Navigation.findNavController(it).navigate(gecis)
        }

        t.buttonEkle.setOnClickListener {
            Snackbar.make(it,"${yemek.ad} eklendi ",Snackbar.LENGTH_SHORT).show()
        }
    }


    override fun getItemCount(): Int {
        return yemeklerListesi.size
    }
}