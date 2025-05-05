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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.designsystem.theme.PokedexTheme
import com.example.pokedex.designsystem.theme.PokedexTheme.sizes
import com.example.pokedex.designsystem.theme.PokedexTheme.typographys
import com.example.pokedex.designsystem.theme.PokedexTypography
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
        imageRes = R.drawable.img_onboarding,
        titleRes = R.string.onboarding_text_title2,
        subtitleRes = R.string.onboarding_text_subtitle2
    )
)


@Composable
fun OnboardingScreen() {
    val pagerState = rememberPagerState(pageCount = { 2 })
    Column(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) { state ->
            OnboardingContentPage(
                modifier = Modifier.fillMaxSize(),
                imageRes = onboardingPagerData[state].imageRes,
                titleRes = onboardingPagerData[state].titleRes,
                subtitleRes = onboardingPagerData[state].subtitleRes
            )
        }
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
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = imageRes), contentDescription = null)
        Spacer(modifier = Modifier.height(sizes.largeXXSize))
        Text(
            modifier = Modifier.padding(sizes.mediumXSize),
            text = stringResource(id = titleRes),
            style = typographys.mediumLarge
        )
        Spacer(modifier = Modifier.height(sizes.mediumSize))
        Text(
            modifier = Modifier.padding(sizes.mediumXSize),
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