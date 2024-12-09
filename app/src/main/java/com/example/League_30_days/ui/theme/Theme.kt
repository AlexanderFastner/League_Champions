package com.example.League_30_days.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.Color


private val DarkColorScheme = darkColorScheme(
    primary = Blue_3,
    secondary = Gold_3,
    tertiary = Grey_2
)

private val LightColorScheme = lightColorScheme(
    primary = Blue_2,
    secondary = Gold_2,
    tertiary = Grey_1
)

val classColorMap = mapOf(
    "Mage" to Color.Blue,
    "Tank" to Color.Green,
    "Assassin" to Color.Red,
    "Fighter" to Color.Magenta,
    "Marksman" to Color.Cyan,
    "Support" to Color.Yellow,
)


@Composable
fun _30_daysTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}