package com.example.boardgames

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                itemsIndexed(
                    mutableListOf(
                        //1-10
                        BoardGame(R.drawable.big_brodilka, "Большая бродилка", "2-5", "8+", "30 мин", "огромный"),
                        BoardGame(R.drawable.code_names_classic, "Кодовые имена\n -классика-","2-8", "10+", "15 мин", "большой"),
                        BoardGame(R.drawable.nuar, "Нуар", "2-9", "12+", "15 мин", "среднний"),
                        BoardGame(R.drawable.pixel_tactics_1, "Пиксель тактикс 1", "2", "12+", "30 мин", "маленький"),
                        BoardGame(R.drawable.gobbit, "Гоббит", "2-8", "6+", "15 мин", "маленький"),
                        BoardGame(R.drawable.solnechnyj_shtorm, "Солнечный шторм", "1-4", "10+", "45 мин", "большой"),
                        BoardGame(R.drawable.siggil, "Сиггил", "1-4", "8+", "20 мин", "маленький"),
                        BoardGame(R.drawable.cesar, "Цезарь", "1-2", "12+", "20 мин", "большой"),
                        BoardGame(R.drawable.shtat_51, "51 штат", "1-4", "12+", "90 мин", "огромный"),
                        BoardGame(R.drawable.hameleony, "Липкие хамелеоны", "2-6", "6+", "15", "большой"),
                        //10-20
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        //20-30
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        //30-40
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        //40-50
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
//                        BoardGame(R.drawable., "", "", "", "", ""),
                    ).sorted()
                ) { _, item ->
                    BoardGameModel(boardGame = item)
                }
            }
        }
    }
}
