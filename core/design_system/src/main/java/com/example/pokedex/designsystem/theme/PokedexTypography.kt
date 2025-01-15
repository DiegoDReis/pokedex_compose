package com.example.pokedex.designsystem.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.pokedex.designsystem.theme.values.NormalFontSize
import com.example.pokedex.designsystem.theme.values.SmallFontSize
import com.example.pokedex.designsystem.theme.values.poppinsFontFamily

data class PokedexTypography (

    val semiBoldlNormal: TextStyle = TextStyle(
        fontFamily = poppinsFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = NormalFontSize,
    ),
    val mediumSmall: TextStyle = TextStyle(
        fontFamily = poppinsFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = SmallFontSize,
    )
)