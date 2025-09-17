package com.example.pokedex.designsystem.component.tag

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.pokedex.designsystem.R
import com.example.pokedex.designsystem.theme.PokedexTheme
import com.example.pokedex.designsystem.theme.PokedexTheme.sizes

@Composable
fun PokeTag(
    modifier: Modifier = Modifier,
    backGroundColor: Color,
    @DrawableRes iconResId: Int,
    iconSize: Dp? = null,
    iconModifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit = {}
) {
    Row(
        modifier = modifier.background(
            color = backGroundColor,
            shape = RoundedCornerShape(sizes.tagBorderStrokeSize)
        ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = iconModifier.size(iconSize ?: sizes.mediumSize ),
            painter = painterResource(id = iconResId),
            contentDescription = null
        )
        content()
    }
}

@Preview
@Composable
private fun PokeTagPreview() {
    PokeTag(
        modifier = Modifier.size(68.dp, height = 12.dp),
        backGroundColor = PokedexTheme.colors.orangeFire,
        iconResId = R.drawable.ic_fire
    )
}