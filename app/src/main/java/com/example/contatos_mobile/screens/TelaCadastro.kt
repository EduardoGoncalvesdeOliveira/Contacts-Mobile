package com.example.contatos_mobile.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contatos_mobile.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaCadastro() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Voltar"
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(text = "Novo Contato")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFFFC107)
                )
            )
        },
        content = {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                Column(
                    modifier = Modifier
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .size(width = 150.dp, height = 150.dp),
                        contentAlignment = Alignment.BottomEnd
                    ) {
                        Card(
                            modifier = Modifier
                                .fillMaxSize(),
                            border = BorderStroke(2.dp, Color(0xFFFFC107)),
                            shape = CircleShape
                        ) {
                            Image(
                                modifier = Modifier
                                    .fillMaxSize(),
                                contentScale = ContentScale.Crop,
                                painter = painterResource(id = R.drawable.matheus),
                                contentDescription = "owbviuwb"
                            )
                        }
                        Card(
                            modifier = Modifier
                                .size(width = 50.dp, height = 50.dp),
                            shape = CircleShape,
                            CardDefaults.cardColors(containerColor = Color(0xFFFFC107))
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.PhotoCamera,
                                    contentDescription = "vjruv",
                                    tint = Color.Black
                                )
                            }
                        }
                    }
                    OutlinedTextField(
                        value = "", onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        label = {
                                Text(text = "Nome")
                            },
                        shape = RoundedCornerShape(16.dp)
                    )
                    OutlinedTextField(
                        value = "", onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        label = {
                            Text(text = "Email")
                        },
                        shape = RoundedCornerShape(16.dp)
                    )
                    OutlinedTextField(
                        value = "", onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        label = {
                            Text(text = "Telefone")
                        },
                        shape = RoundedCornerShape(16.dp)
                    )
                    OutlinedTextField(
                        value = "", onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        label = {
                            Text(text = "Data do nascimento")
                        },
                        shape = RoundedCornerShape(16.dp)
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp)
                    ) {
                        Checkbox(checked = false, onCheckedChange = {})
                        Text(text = "Amigo")
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC107)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(64.dp),
                    ) {
                        Text(
                            text = "Gravar contato",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }
                }
            }
        }
    )
}

@Preview
@Composable
fun TelaCadastroPreview() {
    TelaCadastro()
}