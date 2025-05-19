package com.example.pokedex.feature.onboarding.presentation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.relocation.bringIntoViewRequester
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.pokedex.designsystem.component.button.PokeArrowButton
import com.example.pokedex.designsystem.component.button.PokeButtonBase
import com.example.pokedex.designsystem.component.indicator.PokeIndicator
import com.example.pokedex.designsystem.theme.PokedexTheme
import com.example.pokedex.designsystem.theme.PokedexTheme.colors
import com.example.pokedex.designsystem.theme.PokedexTheme.sizes
import com.example.pokedex.designsystem.theme.PokedexTheme.typographys
import com.example.pokedex.onboarding.R

data class OnboardingPagerData(
    val imageRes: Int,
    val titleRes: Int,
    val subtitleRes: Int
)


val onboardingPagerData = listOf(
    OnboardingPagerData(
        imageRes = R.drawable.img_onboarding1,
        titleRes = R.string.onboarding_text_title1,
        subtitleRes = R.string.onboarding_text_subtitle1
    ),
    OnboardingPagerData(
        imageRes = R.drawable.img_onboarding2,
        titleRes = R.string.onboarding_text_title2,
        subtitleRes = R.string.onboarding_text_subtitle2
    )
)


@Composable
fun OnboardingScreen() {
    val pagerState = rememberPagerState(pageCount = { 2 })
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        HorizontalPager(
            state = pagerState, modifier = Modifier
                .fillMaxSize()
                .weight(1F)
        ) { state ->
            OnboardingContentPage(
                modifier = Modifier.fillMaxSize(),
                imageRes = onboardingPagerData[state].imageRes,
                titleRes = onboardingPagerData[state].titleRes,
                subtitleRes = onboardingPagerData[state].subtitleRes
            )
        }
        Spacer(Modifier.height(sizes.mediumXXSize))
        PokeIndicator(
            modifier = Modifier
                .wrapContentSize(),
            pagerState = pagerState
        )
        Spacer(Modifier.height(sizes.mediumXXSize))
        PokeArrowButton(
            modifier = Modifier
                .height(sizes.buttonTallSize)
                .padding(horizontal = sizes.mediumXSize),
            buttonColor = colors.blueNav,
            textColor = Color.White,
            text = "Continuar"
        ) { }
        Spacer(Modifier.height(sizes.largeXXSize))
    }
}


@Composable
private fun OnboardingContentPage(
    modifier: Modifier = Modifier,
    @DrawableRes imageRes: Int,
    @StringRes titleRes: Int,
    @StringRes subtitleRes: Int,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Image(painter = painterResource(id = imageRes), contentDescription = null)
        Spacer(modifier = Modifier.height(sizes.largeXXSize))
        Text(
            modifier = Modifier.padding(horizontal = sizes.mediumXSize),
            text = stringResource(id = titleRes),
            style = typographys.mediumLarge
        )
        Spacer(modifier = Modifier.height(sizes.mediumSize))
        Text(
            modifier = Modifier.padding(horizontal = sizes.mediumXSize),
            text = stringResource(id = subtitleRes),
            style = typographys.regularNormal
        )
    }
}


@Preview
@Composable
private fun PreviewOnboardingScreen() {
    OnboardingScreen()
}