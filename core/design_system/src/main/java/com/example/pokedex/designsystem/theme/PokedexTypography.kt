package com.example.pokedex.designsystem.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.pokedex.designsystem.theme.values.LagerFontSize
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
    ),
    val regularNormal: TextStyle = TextStyle(
        fontFamily = poppinsFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = NormalFontSize,
        textAlign = TextAlign.Center
    ),
    val mediumLarge: TextStyle = TextStyle(
        fontFamily = poppinsFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = LagerFontSize,
        textAlign = TextAlign.Center
    )
)