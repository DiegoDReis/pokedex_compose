package com.example.pokedex.designsystem.component.tag

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.unit.dp
import com.example.pokedex.designsystem.R
import com.example.pokedex.designsystem.theme.PokedexTheme
import com.example.pokedex.designsystem.theme.PokedexTheme.sizes

@Composable
fun PokeTagText(
    modifier: Modifier = Modifier,
    backGroundColor: Color,
    @DrawableRes iconResId: Int,
    textColor: Color,
    text: String
) {
    PokeTag(
        modifier = modifier,
        backGroundColor = backGroundColor,
        iconResId = iconResId,
        iconModifier = Modifier.padding(
            horizontal = sizes.tagHorizontalPaddingSize,
            vertical = sizes.tagVerticalPaddingSize
        )
    ) {
        Text(
            modifier = Modifier.padding(end = sizes.tagHorizontalPaddingSize),
            text = text,
            color = textColor,
            style = PokedexTheme.typographys.mediumSmall
        )
    }
}

@Preview
@Composable
private fun PokeTagTextPreview() {
    PokeTagText(
        backGroundColor = PokedexTheme.colors.orangeFire,
        iconResId = R.drawable.ic_fire_rounded,
        textColor = Color.Black,
        text = "Fire"
    )
}