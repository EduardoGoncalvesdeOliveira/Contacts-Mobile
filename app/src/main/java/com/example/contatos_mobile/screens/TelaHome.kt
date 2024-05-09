package com.example.contatos_mobile.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaHome() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Meus contatos")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFFFC107),
                    titleContentColor = Color.Black
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = Color(0xFFFFC107),
                contentColor = Color.Black,
                shape = CircleShape
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Botão Addcionar")
            }
        },
        content = {
            // toooodo o conteúdo fica aqui

            LazyColumn(
                modifier = Modifier
                    .padding(it)
            ) {
                items(10) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .height(100.dp)
                    ) {

                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 20.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Card(
                                modifier = Modifier
                                    .padding(end = 40.dp)
                                    .size(width = 60.dp, height = 60.dp),
                                shape = CircleShape,
                                colors = CardDefaults.cardColors(containerColor = Color(0xFFFFC107))
                            ) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(text = "N", fontSize = 28.sp)
                                }
                            }
                            Column(modifier = Modifier){
                                Text(text = "Nome", fontWeight = FontWeight.Bold, fontSize = 16 .sp)
                                Text(text = "Email")
                            }
                        }
                    }
                }
            }
        }
    )
}

@Preview(showSystemUi = true)
@Composable
fun TelaHomePreview() {
    TelaHome()
}