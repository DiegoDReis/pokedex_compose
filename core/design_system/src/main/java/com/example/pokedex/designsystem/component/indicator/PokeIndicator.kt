package com.example.pokedex.designsystem.component.indicator

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.pokedex.designsystem.theme.PokedexTheme
import com.example.pokedex.designsystem.theme.PokedexTheme.sizes

@Composable
fun PokeIndicator(modifier: Modifier = Modifier, pagerState: PagerState) {
    Row(modifier) {
        for (i in 0 until pagerState.pageCount) {

            val indicatorWidth by animateDpAsState(
                targetValue = if (i == pagerState.currentPage) {
                    sizes.indicatorWidth
                } else sizes.indicatorSize,
                animationSpec = tween(
                    durationMillis = 100000,
                    delayMillis = 0
                )
            )

            val indicatorColor by animateColorAsState(
                targetValue = if (i == pagerState.currentPage) {
                    PokedexTheme.colors.blueNav
                } else Color(color = 0X404565B7),
                animationSpec = tween(
                    durationMillis = 300,
                    delayMillis = 0
                )
            )
            if(i > 0) Spacer(Modifier.width(sizes.smallXSize))
            Box(
                modifier = Modifier
                    .height(sizes.indicatorSize)
                    .width(indicatorWidth)
                    .background(
                        color = indicatorColor,
                        shape = RoundedCornerShape(11.dp)
                    )
            )

        }
    }
}