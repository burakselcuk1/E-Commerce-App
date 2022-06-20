package com.example.e_commerce.data

class CategoryItems {

    fun defineDatas(): ArrayList<Category> {
        val a = Category("sadf","https://www.incimages.com/uploaded_files/image/1920x1080/getty_80116649_344560.jpg")
        val b = Category("sdaf","https://www.provisioneronline.com/ext/resources/images/Responsive-Default-Images/meat-science-review.jpg?1607975249")
        val cc = Category("sdaf","https://www.provisioneronline.com/ext/resources/images/Responsive-Default-Images/meat-science-review.jpg?1607975249")
        val d = Category("sdaf","https://www.provisioneronline.com/ext/resources/images/Responsive-Default-Images/meat-science-review.jpg?1607975249")

        val c = arrayListOf(a,b,cc,d)
        return c
    }

}