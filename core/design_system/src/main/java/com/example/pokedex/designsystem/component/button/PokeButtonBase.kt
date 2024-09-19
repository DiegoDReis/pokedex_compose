package com.example.pokedex.designsystem.component.button

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.pokedex.designsystem.theme.PokedexTheme
import com.example.pokedex.designsystem.theme.PokedexTheme.colors
import com.example.pokedex.designsystem.theme.PokedexTheme.sizes
import com.example.pokedex.designsystem.theme.PokedexTheme.typographys

@Composable
fun PokeButtonBase(
    modifier: Modifier = Modifier,
    buttonColor: Color,
    textColor: Color,
    content: @Composable RowScope.() -> Unit,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val colorClicked by animateColor(if (isPressed) Color.Transparent else buttonColor)
    val colorTextClicked by animateColor(if (isPressed) buttonColor else textColor)
    Button(

        onClick = onClick,
        modifier = modifier.wrapContentSize(),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorClicked,
            contentColor = colorTextClicked
        ),
        border = BorderStroke(sizes.buttonBorderStroke, buttonColor),
        interactionSource = interactionSource,
        content = content
    )
}

@Composable
private fun animateColor(targetValue: Color) = animateColorAsState(
    targetValue = targetValue,
    label = String(),
    animationSpec = tween(durationMillis = 4_00)
)

@Preview
@Composable
private fun PokeButtonBasePreview() {
    PokedexTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            PokeButtonBase(
                buttonColor = colors.orangeFire,
                textColor= colors.grayTypes,
                content = { Text(text = "Button", style = typographys.normal) },
            ) {

            }
        }
    }
}