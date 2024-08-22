package com.example.pokedex.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

private val LocalColorScheme = staticCompositionLocalOf { PokedexColors() }

@Composable
fun PokedexTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    CompositionLocalProvider(
        LocalColorScheme provides PokedexTheme.colors,
    ) {

    }

}

object PokedexTheme {
    val colors: PokedexColors
        @Composable
        get() = LocalColorScheme.current
}