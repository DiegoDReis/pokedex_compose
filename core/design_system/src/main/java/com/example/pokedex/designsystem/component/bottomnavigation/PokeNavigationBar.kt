package com.example.pokedex.designsystem.component.bottomnavigation

import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.pokedex.designsystem.R
import com.example.pokedex.designsystem.theme.PokedexTheme

@Composable
fun PokeNavigationBar() {
    var selectedItem by remember {
        mutableIntStateOf(0)
    }

    NavigationBar {
        PokeNavigationBarItem(
            selected = selectedItem == 0,
            onClick = { selectedItem = 0 },
            iconResId = R.drawable.ic_pokeball,
            iconResSelectedId = R.drawable.ic_pokeball_sellected,
            labelResId = R.string.nav_bar_home
        )
        PokeNavigationBarItem(
            selected = selectedItem == 1,
            onClick = { selectedItem = 1 },
            iconResId = R.drawable.ic_pokeball,
            iconResSelectedId = R.drawable.ic_pokeball_sellected,
            labelResId = R.string.nav_bar_home
        )

        PokeNavigationBarItem(
            selected = selectedItem == 2,
            onClick = { selectedItem = 2 },
            iconResId = R.drawable.ic_pokeball,
            iconResSelectedId = R.drawable.ic_pokeball_sellected,
            labelResId = R.string.nav_bar_home
        )
        PokeNavigationBarItem(
            selected = selectedItem == 3,
            onClick = { selectedItem = 3 },
            iconResId = R.drawable.ic_pokeball,
            iconResSelectedId = R.drawable.ic_pokeball_sellected,
            labelResId = R.string.nav_bar_home
        )
    }
}

@Preview
@Composable
fun PokeNavigationBarPreview() {
    PokedexTheme {
        PokeNavigationBar()
    }
}