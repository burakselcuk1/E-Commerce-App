package com.example.e_commerce.data.category.vegetable

import com.example.e_commerce.data.category.mutton.Mutton

class VegetableItems {

    fun defineDatas(): ArrayList<Vegetable> {
        val a = Vegetable("lamb neck","https://www.tazemasa.com/Uploads/UrunResimleri/buyuk/kuzu-gerdan-kg-.-bb7a.jpg","250","140")
        val b = Vegetable("Lamb Chops","https://www.etgros.com/wp-content/uploads/2020/05/unnamed-23.jpg","236","200")
        val cc = Vegetable("Lamb Ribs","https://www.etgros.com/wp-content/uploads/2020/05/03.jpg","90","50")
        val d = Vegetable("Lamb cutlet","https://www.etgros.com/wp-content/uploads/2020/05/KUZU-K%C3%9CLBASTI-KG.jpg","236","200")
        val cc1 = Vegetable("Lamb's shank","https://migros-dali-storage-prod.global.ssl.fastly.net/sanalmarket/product/24010220/kuzu-incik-ddd623-1650x1650.jpg","236","200")
        val d1 = Vegetable("Roast Lamb","https://img-ozdilekteyim.mncdn.com/mnresize/1200/1200/medias/?context=bWFzdGVyfHByb2R1Y3RpbWd8MTAwMzYyfGltYWdlL2pwZWd8aGNkL2gyNy85MTQ4OTU5NTIyODQ2fGZlMzkyZWFmYjU5NDk1ZjM2NjJhYTRmYzBhNjQ4MTM3NTYzM2M3NDAyMWVjZGE2M2Q3OGE3ZTNhMjRjYjg1YmM","236","200")

        val c = arrayListOf(cc,d,a,b,cc1,d1)
        return c
    }

}