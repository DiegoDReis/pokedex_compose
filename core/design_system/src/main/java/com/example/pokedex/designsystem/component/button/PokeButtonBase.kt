package com.example.pokedex.designsystem.component.button

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.designsystem.theme.PokedexTheme


@Composable
fun PokeButtonBase(color: Color) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val colorClicked by animateColorAsState(
        targetValue = if (isPressed) Color.Transparent else color
    )
    val colorTextClicked by animateColorAsState(
        targetValue = if (isPressed) color else Color.White
    )

    Button(
        onClick = {},
        modifier = Modifier
            .wrapContentSize()
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorClicked,
            contentColor = colorTextClicked
        ),
        border = BorderStroke(2.dp, color),
        interactionSource = interactionSource
    ) {
        Text(text = "Button")
    }
}

@Preview
@Composable
private fun PokeButtonBasePreview() {
    Column(modifier = Modifier.fillMaxSize()) {
        PokeButtonBase(PokedexTheme.colors.pinkFairy)
    }
}