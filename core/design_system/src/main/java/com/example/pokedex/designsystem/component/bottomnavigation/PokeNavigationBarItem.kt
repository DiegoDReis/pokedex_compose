package com.example.pokedex.designsystem.component.bottomnavigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.designsystem.R
import com.example.pokedex.designsystem.theme.PokedexTheme
import com.example.pokedex.designsystem.theme.PokedexTheme.colors
import com.example.pokedex.designsystem.theme.PokedexTheme.typographys

@Composable
fun RowScope.PokeNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    @DrawableRes iconResId: Int,
    @DrawableRes iconResSelectedId: Int,
    icoContentDescription: String? = null,
    @StringRes labelResId: Int
) {
    NavigationBarItem(
        selected = selected,
        onClick = onClick,
        alwaysShowLabel = false,
        colors = NavigationBarItemDefaults.colors(indicatorColor = MaterialTheme.colorScheme.inverseOnSurface),
        icon = {
            AnimatedVisibility(
                visible = selected,
                enter = fadeIn(animationSpec = TweenSpec(500)),
                exit = fadeOut(animationSpec = TweenSpec(500))
            ) {
                Image(
                    modifier = Modifier.size(26.dp),
                    painter = painterResource(id = iconResSelectedId),
                    contentDescription = icoContentDescription
                )
            }
            AnimatedVisibility(
                visible = !selected,
                enter = fadeIn(animationSpec = TweenSpec(500)),
                exit = fadeOut(animationSpec = TweenSpec(500))
            ) {
                Image(
                    modifier = Modifier.size(26.dp),
                    painter = painterResource(id = iconResId),
                    contentDescription = icoContentDescription
                )
            }
        },
        label = {
            Text(
                text = stringResource(id = labelResId),
                style = typographys.mediumSmall,
                color = colors.blueNav
            )
        },
    )

}

@Preview
@Composable
fun PokeNavigationBarItemPreview() {

    Row {
        PokeNavigationBarItem(
            selected = false,
            onClick = { /*TODO*/ },
            iconResId = R.drawable.ic_pokeball,
            iconResSelectedId = R.drawable.ic_pokeball_sellected,
            labelResId = R.string.nav_bar_home
        )
    }
}
