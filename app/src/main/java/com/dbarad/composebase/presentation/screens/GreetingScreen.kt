package com.dbarad.composebase.presentation.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.dbarad.composebase.presentation.viewmodels.MainViewModel

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, viewModel: MainViewModel = hiltViewModel()) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _root_ide_package_.com.dbarad.composebase.presentation.theme.ComposeBaseTheme {
        Greeting("Android")
    }
}