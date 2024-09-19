package com.example.pokedex.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

private val LocalColorScheme = staticCompositionLocalOf { PokedexColor() }
private val LocalTypographyScheme = staticCompositionLocalOf { PokedexTypography() }
private val LocalSizeScheme = staticCompositionLocalOf { PokedexSize() }


@Composable
fun PokedexTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    CompositionLocalProvider(
        LocalColorScheme provides PokedexTheme.colors,
        LocalRippleTheme provides PokedexRippleTheme,
        LocalTypographyScheme provides PokedexTheme.typographys,
        LocalSizeScheme provides PokedexTheme.sizes
    ) {
        content()
    }

}

object PokedexTheme {
    val colors: PokedexColor
        @Composable
        get() = LocalColorScheme.current

    val typographys: PokedexTypography
        @Composable
        get() = LocalTypographyScheme.current

    val sizes: PokedexSize
        @Composable
        get() = LocalSizeScheme.current
}