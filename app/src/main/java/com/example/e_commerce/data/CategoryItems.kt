package com.example.e_commerce.data

class CategoryItems {

    fun defineDatas(): ArrayList<Category> {
        val a = Category("BEEF","https://res.cloudinary.com/fleetnation/image/private/c_fit,w_1120/g_south,l_text:style_gothic2:%C2%A9%20Lubos%20Chlubny,o_20,y_10/g_center,l_watermark4,o_25,y_50/v1451683758/x8tintzjuzmlfrcbkfbp.jpg")
        val b = Category("MUTTON","https://www.provisioneronline.com/ext/resources/images/Responsive-Default-Images/meat-science-review.jpg?1607975249")
        val cc = Category("FISH","https://img.freepik.com/free-photo/fish-steak-white-backgrounds_183352-882.jpg?w=2000")
        val d = Category("VEGETABLES","https://images.fineartamerica.com/images-medium-large-5/tomato-vegetables-pile-isolated-on-white-background-cutout-wanlop-sonngam.jpg")

        val c = arrayListOf(a,b,cc,d)
        return c
    }

}