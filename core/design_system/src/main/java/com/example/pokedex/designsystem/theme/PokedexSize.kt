package com.example.pokedex.designsystem.theme

import androidx.compose.ui.unit.Dp
import com.example.pokedex.designsystem.theme.values.ButtonBorderStrokeSize
import com.example.pokedex.designsystem.theme.values.NoneSize
import com.example.pokedex.designsystem.theme.values.TagBorderStrokeSize
import com.example.pokedex.designsystem.theme.values.TagHorizontalPaddingSize
import com.example.pokedex.designsystem.theme.values.TagVerticalPaddingSize

data class PokedexSize (
    val buttonBorderStrokeSize:Dp  = ButtonBorderStrokeSize,
    val tagBorderStrokeSize:Dp  = TagBorderStrokeSize,
    val tagHorizontalPaddingSize: Dp = TagHorizontalPaddingSize,
    val tagVerticalPaddingSize: Dp = TagVerticalPaddingSize,
    val noneSize: Dp = NoneSize
)