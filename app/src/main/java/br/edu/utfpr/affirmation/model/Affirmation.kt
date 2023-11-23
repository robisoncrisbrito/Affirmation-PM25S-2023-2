package br.edu.utfpr.affirmation.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation (
    @StringRes  val stringResourdId : Int,
    @DrawableRes val imageResourceId: Int
)