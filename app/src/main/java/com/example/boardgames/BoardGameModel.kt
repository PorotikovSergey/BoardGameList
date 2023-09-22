package com.example.boardgames

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BoardGameModel(boardGame: BoardGame) {
    var isOpened by remember {
        mutableStateOf(false)
    }
    Card(
        modifier = Modifier
            .shadow(5.dp)
            .padding(4.dp)
            .fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(4.dp)
        ) {
            Image(
                painter = painterResource(id = boardGame.picture),
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(2.dp)
                    .size(100.dp)
                    .clip(RoundedCornerShape(25.dp))
            )
            Column() {
                Text(text = boardGame.name, Modifier.offset(20.dp), fontSize = 25.sp)
                Text(
                    modifier = Modifier
                        .clickable {
                            isOpened = !isOpened
                        }
                        .offset(5.dp),
                    maxLines = if (isOpened) 3 else 1,
                    text = boardGame.info(),
                    fontSize = 12.sp
                )
            }

        }
    }
}