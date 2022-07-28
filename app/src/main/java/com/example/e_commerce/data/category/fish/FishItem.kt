package com.example.e_commerce.data.category.fish

import com.example.e_commerce.data.category.mutton.Mutton

class FishItem {

    fun defineDatas(): ArrayList<Fish> {
        val a = Fish("Alligator Gar","https://static.fishingbooker.com/public/images/fish/275x160/alligator-gar.png","250","140")
        val b = Fish("Amberjack","https://static.fishingbooker.com/public/images/fish/275x160/amberjack.png","236","200")
        val cc = Fish("Arapaima","https://static.fishingbooker.com/public/images/fish/275x160/arapaima.png","90","50")
        val d = Fish("Arctic Char","https://static.fishingbooker.com/public/images/fish/275x160/arctic-char.png","236","200")
        val cc1 = Fish("Asp","https://static.fishingbooker.com/public/images/fish/275x160/asp.png","236","200")
        val d1 = Fish("Barracuda (Great)","https://static.fishingbooker.com/public/images/fish/275x160/barracuda-great.png","236","200")

        val c = arrayListOf(cc,d,a,b,cc1,d1)
        return c
    }
}