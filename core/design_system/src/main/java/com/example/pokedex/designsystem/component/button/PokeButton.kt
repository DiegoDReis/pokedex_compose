package com.example.pokedex.designsystem.component.button

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.designsystem.R
import com.example.pokedex.designsystem.theme.PokedexTheme

@Composable
fun PokeArrowButton(
    modifier: Modifier = Modifier,
    text: String,
    @DrawableRes iconIdRes: Int? = null,
    buttonColor: Color,
    textColor: Color,
    onClick: () -> Unit
) {
    PokeButtonBase(
        modifier = modifier,
        buttonColor = buttonColor,
        textColor = textColor,
        content = {
            Box(Modifier.fillMaxWidth()) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = text,
                    style = PokedexTheme.typographys.normal
                )
                iconIdRes?.let {
                    Icon(
                        modifier = Modifier.align(CenterEnd),
                        painter = painterResource(id = it),
                        contentDescription = null
                    )
                }
            }
        },
        onClick = onClick
    )
}

@Preview
@Composable
private fun PokeArrowButtonPreview() {
    PokedexTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            PokeArrowButton(
                text = "Fogo",
                iconIdRes = null,
                buttonColor = PokedexTheme.colors.orangeFire,
                textColor = PokedexTheme.colors.grayTypes
            ) {

            }
            Spacer(modifier = Modifier.height(10.dp))
            PokeArrowButton(
                modifier = Modifier.fillMaxWidth(0.5f),
                text = "Fogo",
                iconIdRes = R.drawable.ic_down_arrow,
                buttonColor = PokedexTheme.colors.orangeFire,
                textColor = PokedexTheme.colors.grayTypes
            ) {

            }
        }
    }
}