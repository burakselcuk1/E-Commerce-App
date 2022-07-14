package com.example.e_commerce.data.category.beef

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "beef_data")
data class Beef(
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    var isim:String,
    var url:String,
    var oldPrice:String,
    var newPrice:String
):Serializable
