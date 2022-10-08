package unj.cs.hw4.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Coffee(
    @DrawableRes val imageResourceId: Int,
    @StringRes val title: Int,
    @StringRes val label: Int,
    @StringRes val desc: Int,
    val fav: Boolean
) : Parcelable