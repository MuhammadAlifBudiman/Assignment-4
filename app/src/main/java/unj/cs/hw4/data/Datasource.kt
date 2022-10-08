package unj.cs.hw4.data

import unj.cs.hw4.model.Coffee
import unj.cs.hw4.R
import java.util.ArrayList

class Datasource() {
    fun loadCoffee(): List<Coffee> {
        return listOf<Coffee>(
            Coffee(R.drawable.image1, R.string.judul1, R.string.label1, R.string.desc1, false),
            Coffee(R.drawable.image2, R.string.judul2, R.string.label2, R.string.desc2, false),
            Coffee(R.drawable.image3, R.string.judul3, R.string.label3, R.string.desc3, false),
            Coffee(R.drawable.image4, R.string.judul4, R.string.label4, R.string.desc4, false),
            Coffee(R.drawable.image5, R.string.judul5, R.string.label5, R.string.desc5,false),
            Coffee(R.drawable.image6, R.string.judul6, R.string.label6, R.string.desc6, false),
            Coffee(R.drawable.image7, R.string.judul7, R.string.label7, R.string.desc7, false),
            Coffee(R.drawable.image8, R.string.judul8, R.string.label8, R.string.desc8, false),
            Coffee(R.drawable.image9, R.string.judul9, R.string.label9, R.string.desc9, false),
            Coffee(R.drawable.image10, R.string.judul10, R.string.label10, R.string.desc10, false))
    }
}