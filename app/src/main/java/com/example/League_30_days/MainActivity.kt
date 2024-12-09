package com.example.League_30_days

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.League_30_days.model.Champion
import com.example.League_30_days.model.ChampionPool.Champions
import com.example.League_30_days.ui.theme._30_daysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30_daysTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Daily_League_App()
                }
            }
        }
    }
}


//TODO
//add toggle to force switch light and dark mode
//animations for opening and closing the expansions
//reuse later to add search bar or selector based on class maybe!!


@Composable
fun Daily_League_App() {
    Scaffold(
        topBar = {
            TopAppBar()
        }
    ) { paddingValues ->
        val champions = Champions
        ChampionsColumn(
            champions = champions,
            modifier = Modifier.padding(paddingValues)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    modifier = Modifier.size(52.dp).padding(top = 4.dp, bottom = 4.dp),
                    painter = painterResource(R.drawable.league_icon),
                    contentDescription = null
                )
                Text(
                    text = "League Champions",
                    style = MaterialTheme.typography.displayLarge,
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(MaterialTheme.colorScheme.primary),
        modifier = Modifier.height(70.dp),
    )
}


@Preview("Light Mode", showBackground = true)
@Composable
fun SuperHeroesPreview() {
    _30_daysTheme (darkTheme = false) {
        Daily_League_App()
    }
}

@Preview("Dark Mode", showBackground = true)
@Composable
fun DarkSuperHeroesPreview() {
    _30_daysTheme (darkTheme = true) {
        Daily_League_App()
    }
}


