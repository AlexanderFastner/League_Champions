package com.example.League_30_days

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.League_30_days.model.Champion
import com.example.League_30_days.model.ChampionPool
import com.example.League_30_days.ui.theme.Montserrat
import com.example.League_30_days.ui.theme._30_daysTheme
import com.example.League_30_days.ui.theme.classColorMap


@Composable
fun ChampionItem(
    champion: Champion,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }


    Card(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 20.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondary,
        ),
    ) {
        Column (
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioLowBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.Top
            ) {
                Column(
                    modifier = Modifier.weight(1f),
                ) {
                    Text(
                        text = buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = if (isSystemInDarkTheme()) Color.Black else MaterialTheme.colorScheme.onSurface,
                                )
                            ) {
                                append(stringResource(champion.nameResource))
                                append(": ")
                                append(stringResource(champion.titleResource))
                            }
                        },
                        style = MaterialTheme.typography.displayMedium
                    )
                    Spacer(Modifier.height(8.dp))

                    ColoredWordsText(
                        stringResource(champion.classResource),
                        colorMap = classColorMap
                    )

//                    Text(
//                        text = buildAnnotatedString {
//                            withStyle(
//                                style = SpanStyle(
//                                )
//                            ) {
//                                append(stringResource(champion.classResource))
//                            }
//                        },
//                        style = MaterialTheme.typography.displayMedium
//                    )
                }
                Spacer(Modifier.width(16.dp))
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(RoundedCornerShape(8.dp))
                ) {
                    Image(
                        painterResource(champion.imageResource),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                }
                Spacer(Modifier.width(8.dp))
                ExpansionButton(
                    expanded = expanded,
                    onClick = { expanded = !expanded }
                )
            }
            if (expanded) {
                Text(
                    stringResource(champion.descriptionResource),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }
    }
}

@Composable
fun ColoredWordsText(text: String, colorMap: Map<String, Color>) {
    val annotatedString = buildAnnotatedString {
        val words = text.replace("[", "").replace("]", "").split(", ")
        words.forEachIndexed { index, word ->
            val color = colorMap[word] ?: Color.Unspecified

            withStyle(style = SpanStyle(color = Color.Black)) {
                append("[")
            }
            withStyle(style = SpanStyle(color = color)) {
                append(word)
            }
            withStyle(style = SpanStyle(color = Color.Black)) {
                append("]")
            }
            if (index < words.size - 1) {
                append(" ")
            }
        }
    }

    Text(text = annotatedString, style = MaterialTheme.typography.displayMedium)
}


@Composable
private fun ExpansionButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Icon(
            imageVector = if (expanded) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
            contentDescription = stringResource(R.string.expand_button_content_description),
            tint = MaterialTheme.colorScheme.tertiary
        )
    }

}


@Composable
fun ChampionsColumn (
    champions: List<Champion>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
){
    Surface (
        color = MaterialTheme.colorScheme.tertiary
    ) {
        LazyColumn (modifier = modifier){
            itemsIndexed(champions) { index, champion ->
                ChampionItem(
                    champion = champion,
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }
    }
}

@Preview("Champion Item")
@Composable
fun ChampionItemPreview() {
    _30_daysTheme(darkTheme = false) {
        Surface (
        ) {
            ChampionItem(champion = ChampionPool.Champions[0])
        }
    }
}

@Preview("Dark Champion Item")
@Composable
fun DarkChampionItemPreview() {
    _30_daysTheme(darkTheme = true) {
        Surface (
        ) {
            ChampionItem(champion = ChampionPool.Champions[0])
        }
    }
}


@Preview("Champions List")
@Composable
fun ChampionsPreview() {
    _30_daysTheme(darkTheme = false) {
        Surface (
        ) {
            ChampionsColumn(champions = ChampionPool.Champions)
        }
    }
}

@Preview("Dark Champions List")
@Composable
fun DarkChampionsPreview() {
    _30_daysTheme(darkTheme = true) {
        Surface (
        ) {
            ChampionsColumn(champions = ChampionPool.Champions)
        }
    }
}

