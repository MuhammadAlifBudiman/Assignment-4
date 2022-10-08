package unj.cs.hw4.model
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class coffee(
    @DrawableRes val imageResourceId: Int,
    @StringRes val judul: Int,
    @StringRes val deskripsi: Int
)