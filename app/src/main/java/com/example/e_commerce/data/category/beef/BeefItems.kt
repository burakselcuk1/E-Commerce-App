package com.example.e_commerce.data.category.beef

class BeefItems {

    fun defineDatas(): ArrayList<Beef> {
        val a = Beef("Beef Steak-Roast","https://bakbugross.com/images/dana-biftek-rosto-2-453062.jpg","250","140")
        val b = Beef("Cattle Beef","https://nebilcdn.blob.core.windows.net/citylinux/0023293_dana-kontrafile-1-kg_510.jpg","236","200")
        val cc = Beef("Beef Mince","https://cdn.cimri.io/market/260x260/ersan-400-gr-dana-kiyma-_910611.jpg","90","50")
        val d = Beef("Cattle Sheets","https://cdn.cimri.io/market/260x260/1-kg-dana-kusbasi-_286488.jpg","236","200")
        val cc1 = Beef("Beef Chop","https://www.egebaranet.com.tr/images/urun/253_pirzola.jpg","236","200")
        val d1 = Beef("Beef Tenderloin","https://kalorisor.com/uploads/images/urun/fileto-bonfile-sigir-eti.jpg","236","200")

        val c = arrayListOf(cc,d,a,b,cc1,d1)
        return c
    }
}