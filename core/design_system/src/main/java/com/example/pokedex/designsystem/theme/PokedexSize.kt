package com.example.pokedex.designsystem.theme

import androidx.compose.ui.unit.Dp
import com.example.pokedex.designsystem.theme.values.ButtonBorderStrokeSize
import com.example.pokedex.designsystem.theme.values.ButtonTallSize
import com.example.pokedex.designsystem.theme.values.IndicatorSize
import com.example.pokedex.designsystem.theme.values.IndicatorWidth
import com.example.pokedex.designsystem.theme.values.LargeSize
import com.example.pokedex.designsystem.theme.values.LargeXSize
import com.example.pokedex.designsystem.theme.values.LargeXXSize
import com.example.pokedex.designsystem.theme.values.MediumSize
import com.example.pokedex.designsystem.theme.values.MediumXSize
import com.example.pokedex.designsystem.theme.values.MediumXXSize
import com.example.pokedex.designsystem.theme.values.NoneSize
import com.example.pokedex.designsystem.theme.values.SmallSize
import com.example.pokedex.designsystem.theme.values.SmallXSize
import com.example.pokedex.designsystem.theme.values.SmallXXSize
import com.example.pokedex.designsystem.theme.values.TagBorderStrokeSize
import com.example.pokedex.designsystem.theme.values.TagHorizontalPaddingSize
import com.example.pokedex.designsystem.theme.values.TagVerticalPaddingSize

data class PokedexSize (
    val buttonBorderStrokeSize:Dp  = ButtonBorderStrokeSize,
    val tagBorderStrokeSize:Dp  = TagBorderStrokeSize,
    val tagHorizontalPaddingSize: Dp = TagHorizontalPaddingSize,
    val tagVerticalPaddingSize: Dp = TagVerticalPaddingSize,
    val noneSize: Dp = NoneSize,
    val smallXXSize: Dp = SmallXXSize,
    val smallXSize: Dp = SmallXSize,
    val smallSize: Dp = SmallSize,
    val mediumSize: Dp = MediumSize,
    val mediumXSize: Dp = MediumXSize,
    val mediumXXSize: Dp = MediumXXSize,
    val largeSize: Dp = LargeSize,
    val largeXSize: Dp = LargeXSize,
    val largeXXSize: Dp = LargeXXSize,
    val buttonTallSize: Dp = ButtonTallSize,
    val indicatorSize: Dp = IndicatorSize,
    val indicatorWidth: Dp = IndicatorWidth,
)