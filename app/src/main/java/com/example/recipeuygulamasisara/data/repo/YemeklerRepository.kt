package com.example.recipeuygulamasisara.data.repo

import com.example.recipeuygulamasisara.data.datasource.YemeklerDataSource
import com.example.recipeuygulamasisara.data.entity.Yemekler

class YemeklerRepository {
    var yds = YemeklerDataSource() // nesne almamız gerkeiyo çalışması için
    suspend fun yemeklerYukle(): List<Yemekler>  = yds.yemeklerYukle()

}