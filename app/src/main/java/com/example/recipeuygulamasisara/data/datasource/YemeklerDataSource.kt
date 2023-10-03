package com.example.recipeuygulamasisara.data.datasource

import com.example.recipeuygulamasisara.data.entity.Yemekler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class YemeklerDataSource {
    suspend fun yemeklerYukle(): List<Yemekler> =
        withContext(Dispatchers.IO){

            val yemeklerListesi = ArrayList<Yemekler>()
            val f1 = Yemekler(1,"pankek","pankek","pankek tarifi")
            val f2 = Yemekler(2,"copsis","copsis","copsis tarifi")
            val f3 = Yemekler(3,"izmirkofte","izmirkofte","izmirkofte tarifi")
            val f4 = Yemekler(4,"lahmacun","lahmacun","lahmacun tarifi")
            val f5 = Yemekler(5,"makarna","makarna","makarna tarifi")
            val f6 = Yemekler(6,"patates","patates","patates tarifi")


            yemeklerListesi.add(f1)
            yemeklerListesi.add(f2)
            yemeklerListesi.add(f3)
            yemeklerListesi.add(f4)
            yemeklerListesi.add(f5)
            yemeklerListesi.add(f6)

            return@withContext yemeklerListesi
        }
}