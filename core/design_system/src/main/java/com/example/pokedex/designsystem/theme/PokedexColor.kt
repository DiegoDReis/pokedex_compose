package com.example.pokedex.designsystem.theme

import androidx.compose.ui.graphics.Color
import com.example.pokedex.designsystem.theme.values.BlueDragon
import com.example.pokedex.designsystem.theme.values.BlueFly
import com.example.pokedex.designsystem.theme.values.BlueGhost
import com.example.pokedex.designsystem.theme.values.BlueWater
import com.example.pokedex.designsystem.theme.values.GrayNocturn
import com.example.pokedex.designsystem.theme.values.GrayNormal
import com.example.pokedex.designsystem.theme.values.GrayTypes
import com.example.pokedex.designsystem.theme.values.GreenBug
import com.example.pokedex.designsystem.theme.values.GreenGrass
import com.example.pokedex.designsystem.theme.values.GreenIce
import com.example.pokedex.designsystem.theme.values.GreenSteel
import com.example.pokedex.designsystem.theme.values.OrangeFire
import com.example.pokedex.designsystem.theme.values.OrangeTerrestrial
import com.example.pokedex.designsystem.theme.values.PinkFairy
import com.example.pokedex.designsystem.theme.values.PinkFight
import com.example.pokedex.designsystem.theme.values.PinkPsychic
import com.example.pokedex.designsystem.theme.values.PurplePoison
import com.example.pokedex.designsystem.theme.values.YellowElectric
import com.example.pokedex.designsystem.theme.values.YellowRock

data class PokedexColor(
    val grayTypes: Color = GrayTypes,
    val grayNormal: Color = GrayNormal,
    val grayNocturn: Color = GrayNocturn,

    val blueWater: Color = BlueWater,
    val blueDragon: Color = BlueDragon,
    val blueGhost: Color = BlueGhost,
    val blueFly: Color = BlueFly,

    val yellowElectric: Color = YellowElectric,
    val yellowRock: Color = YellowRock,

    val pinkFairy: Color = PinkFairy,
    val pinkFight: Color = PinkFight,
    val pinkPsychic: Color = PinkPsychic,

    val orangeFire: Color = OrangeFire,
    val orangeTerrestrial: Color = OrangeTerrestrial,

    val greenIce: Color = GreenIce,
    val greenGrass: Color = GreenGrass,
    val greenBug: Color = GreenBug,
    val greenSteel: Color = GreenSteel,

    val purplePoison: Color = PurplePoison,
)
