package com.example.currencyconversorapi

object CurrencyUtils {

    fun getFlagsIconsResId1(spinner1SelectedIndex: Int): Int{
        return when(spinner1SelectedIndex) {
            0 -> R.drawable.ic_eur
            1 -> R.drawable.ic_brazil
            2 -> R.drawable.ic_usd
            3 -> R.drawable.ic_aud
            4 -> R.drawable.ic_canadian
            else -> R.drawable.ic_jpy
        }
    }

    fun getFlagsIconsResId2(spinner2SelectedIndex: Int): Int{
        return when(spinner2SelectedIndex) {
            0 -> R.drawable.ic_usd
            1 -> R.drawable.ic_brazil
            2 -> R.drawable.ic_eur
            3 -> R.drawable.ic_aud
            4 -> R.drawable.ic_canadian
            else -> R.drawable.ic_jpy
        }
    }
}