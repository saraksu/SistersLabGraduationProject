package com.example.recipeuygulamasisara.data.entity

import java.io.Serializable

data class Yemekler(
    var id:Int,
    var ad:String,
    var resim:String,
    var tarif:String):Serializable {
}