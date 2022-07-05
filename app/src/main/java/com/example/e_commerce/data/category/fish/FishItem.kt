package com.example.e_commerce.data.category.fish

import com.example.e_commerce.data.category.mutton.Mutton

class FishItem {

    fun defineDatas(): ArrayList<Fish> {
        val a = Fish("lamb neck","https://www.tazemasa.com/Uploads/UrunResimleri/buyuk/kuzu-gerdan-kg-.-bb7a.jpg","250","140")
        val b = Fish("Lamb Chops","https://www.etgros.com/wp-content/uploads/2020/05/unnamed-23.jpg","236","200")
        val cc = Fish("Lamb Ribs","https://www.etgros.com/wp-content/uploads/2020/05/03.jpg","90","50")
        val d = Fish("Lamb cutlet","https://www.etgros.com/wp-content/uploads/2020/05/KUZU-K%C3%9CLBASTI-KG.jpg","236","200")
        val cc1 = Fish("Lamb's shank","https://migros-dali-storage-prod.global.ssl.fastly.net/sanalmarket/product/24010220/kuzu-incik-ddd623-1650x1650.jpg","236","200")
        val d1 = Fish("Roast Lamb","https://img-ozdilekteyim.mncdn.com/mnresize/1200/1200/medias/?context=bWFzdGVyfHByb2R1Y3RpbWd8MTAwMzYyfGltYWdlL2pwZWd8aGNkL2gyNy85MTQ4OTU5NTIyODQ2fGZlMzkyZWFmYjU5NDk1ZjM2NjJhYTRmYzBhNjQ4MTM3NTYzM2M3NDAyMWVjZGE2M2Q3OGE3ZTNhMjRjYjg1YmM","236","200")

        val c = arrayListOf(cc,d,a,b,cc1,d1)
        return c
    }
}