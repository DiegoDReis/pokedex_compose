package com.example.pokedex.feature.onboarding.presentation.pokemon

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.designsystem.component.tag.PokeTagText
import com.example.pokedex.designsystem.theme.PokedexColor
import com.example.pokedex.designsystem.theme.PokedexTheme.sizes
import com.example.pokedex.designsystem.theme.PokedexTheme.typographys
import com.example.pokedex.onboarding.R

@Composable
fun PokemonScreen(data: PokemonScreenData) {
    Column(modifier = Modifier.fillMaxSize()) {
        Header(data)
        Content(data)
    }
}

@Composable
private fun Content(data: PokemonScreenData) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(sizes.mediumXSize)
    ) {
        item { ContentTitle(data) }
    }
}

@Composable
private fun ContentTitle(data: PokemonScreenData) {
    Column {
        Text(text = data.name, style = typographys.mediumXLarge)
        Text(text = data.number.toString(), style = typographys.mediumMedium)
        data.types[0].imageRes?.let { iconRes ->
            PokeTagText(
                modifier = Modifier,
                backGroundColor = data.types[0].color,
                iconResId = iconRes,
                iconSize = 28.dp,
                text = data.types[0].name,
                textColor = Color.Black
            )
        }
    }
}

@Composable
private fun Header(data: PokemonScreenData) {
    Box(contentAlignment = Alignment.Center) {
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(sizes.pokemonForegroundSize)
        ) {
            drawCircle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        data.types[0].color,
                        data.types[0].color,
                        Color.White
                    )
                ),
                radius = size.minDimension,
                center = calculateOffset()
            )
        }
        data.types[0].imageRes?.let { painterResource(it) }?.let {
            Image(
                modifier = Modifier.align(Alignment.Center),
                painter = it,
                contentDescription = null
            )
        }
        Image(
            modifier = Modifier
                .size(sizes.pokemonImageSize)
                .align(Alignment.BottomCenter),
            alignment = Alignment.BottomEnd,
            painter = painterResource(R.drawable.img_pikachu),
            contentDescription = null
        )
    }
}

private fun DrawScope.calculateOffset() = Offset(
    size.width / 2f, (size.height - (size.minDimension * 1.15f))
)

@Preview
@Composable
private fun PreviewPokemonScreen() {
    PokemonScreen(PokemonScreenData())
}

data class PokemonScreenData(
    val name: String = "Pikachu",
    val number: Int = 1,
    val types: List<PokemonType> = listOf(
        PokemonType(
            "Electric",
            imageRes = R.drawable.foregroud_eletric_type,
            color = PokedexColor().yellowElectric
        )
    ),
    val imageUrl: String = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/25.png",
    val foreground: String = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/25.png",
    val backgroundColor: Color = Color(0xFFFFE600),
    val description: String = "Pikachu that can generate powerful electricity have cheek sacs that are extra soft and super stretchy.",
    val weight: String = "6.0 kg",
    val height: String = "0.4 m",
    val category: String = "Mouse Pokémon",
    val principalAbility: String = "Static",
    val weaknesses: List<String> = listOf("Ground"),
    val evolutions: List<String> = listOf("Pichu", "Pikachu", "Raichu")
)

data class PokemonType(
    val name: String,
    val imageUrl: String? = null,
    @DrawableRes val imageRes: Int? = null,
    val color: Color
)
