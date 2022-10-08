package unj.cs.hw4.data
import unj.cs.hw4.R
import unj.cs.hw4.model.coffee
class Datasource() {

    fun loadCoffee(): List<coffee> {
        return listOf<coffee>(
            coffee(R.drawable.image1, R.string.judul1, R.string.desc1),
            coffee(R.drawable.image1, R.string.judul1, R.string.desc1),
            coffee(R.drawable.image1, R.string.judul1, R.string.desc1),
            coffee(R.drawable.image1, R.string.judul1, R.string.desc1),
            coffee(R.drawable.image1, R.string.judul1, R.string.desc1),
            coffee(R.drawable.image1, R.string.judul1, R.string.desc1),
            coffee(R.drawable.image1, R.string.judul1, R.string.desc1),
            coffee(R.drawable.image1, R.string.judul1, R.string.desc1),
            coffee(R.drawable.image1, R.string.judul1, R.string.desc1),
            coffee(R.drawable.image1, R.string.judul1, R.string.desc1))
    }
}