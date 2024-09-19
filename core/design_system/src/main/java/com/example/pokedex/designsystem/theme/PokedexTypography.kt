package com.example.pokedex.designsystem.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.pokedex.designsystem.theme.values.ButtonFontSize
import com.example.pokedex.designsystem.theme.values.poppinsFontFamily

data class PokedexTypography (

    val normal: TextStyle = TextStyle(
        fontFamily = poppinsFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = ButtonFontSize,
    )
)