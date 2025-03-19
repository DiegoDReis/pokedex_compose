package com.example.pokedex.feature.onboarding.presentation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.pokedex.designsystem.theme.PokedexTheme.sizes

@Composable
fun OnboardingScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn {
            item{
                OnboardingContentPage(
                    modifier = Modifier.fillMaxSize(),
                    imageRes = R.drawable.img_onboarding1,
                    titleRes = R.string.onboarding_text_title1,
                    subtitleRes = R.string.onboarding_text_subtitle1
                )
            }
            item {
                OnboardingContentPage(
                    modifier = Modifier.fillMaxSize(),
                    imageRes = R.drawable.img_onboarding1,
                    titleRes = R.string.onboarding_text_title2,
                    subtitleRes = R.string.onboarding_text_subtitle2
                )
            }
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
    Column(modifier = modifier) {
        Image(painter = painterResource(id = imageRes), contentDescription = null)
        Spacer(modifier = Modifier.height(sizes.largeXXSize))
        Text(text = stringResource(id = titleRes))
        Spacer(modifier = Modifier.height(sizes.mediumSize))
        Text(text = stringResource(id = subtitleRes))
    }
}


@Preview
@Composable
private fun PreviewOnboardingScreen() {
    OnboardingScreen()
}