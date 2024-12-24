package com.example.nearby.ui.component.category

import androidx.annotation.DrawableRes
import com.example.nearby.R

enum class CategoryFilterChipView(
    val description: String,
    @DrawableRes val icon: Int
) {
    ALIMENTACAO(description = "Alimentação", icon = R.drawable.ic_tools_kitchen_2),
    COMPRAS(description = "Compras", icon = R.drawable.ic_shopping_bag),
    HOSPEDAGEM(description = "Hospadagem", icon = R.drawable.ic_bed),
    SUPERMERCADO(description = "Supermercado", icon = R.drawable.ic_shopping_cart),
    ENTRETENIMENTO(description = "Cinema", icon = R.drawable.ic_movie),
    FARMACIA(description = "Farmacia", icon = R.drawable.ic_first_aid_kit),
    COMBUSTIVEL(description = "Combustivel", icon = R.drawable.ic_gas_station),
    PADARIA(description = "Padaria", icon = R.drawable.ic_bakery);

    companion object{
        fun fromDescription(description: String): CategoryFilterChipView?{
            return entries.find{it.description == description}
        }
    }

}