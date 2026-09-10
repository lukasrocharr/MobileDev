package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Centraliza o component na tela do celular
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        ChatItem()
                    }
                }
            }
        }
    }
}

@Composable
fun ChatItem() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.Top // Alinha tudo no topo da linha
    ) {
        // Foto de perfil
        Box(
            modifier = Modifier
                .size(52.dp)
                .background(
                    color = Color(0xFF1E4268),
                    shape = RoundedCornerShape(6.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "A",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.width(12.dp)) // Espaço lateral

        // Nome e mensagem
        Column(
            modifier = Modifier.weight(1f) // Ocupa o meio da tela
        ) {
            Text(
                text = "Ana",
                color = Color(0xFF607D9A),
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp)) // Espaço vertical
            Text(
                text = "Olá! Tudo bem?",
                color = Color(0xFFB5C5D1)
            )
        }

        Spacer(modifier = Modifier.width(8.dp)) // Espaço antes da hora

        // Horário colado na direita
        Text(
            text = "14:32",
            color = Color(0xFFE57373),
            fontSize = 11.sp
        )
    }
}

// Tela de testes (Preview)
@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF, widthDp = 360, heightDp = 640)
@Composable
fun ChatItemPreview() {
    MaterialTheme {
        // Centraliza o componente no painel de Preview
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            ChatItem()
        }
    }
}
