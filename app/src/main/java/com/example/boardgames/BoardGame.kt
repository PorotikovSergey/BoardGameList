package com.example.boardgames

data class BoardGame(
    var picture: Int,
    var name: String,
    var capacity: String = "",
    var age: String = "-",
    var time: String = "-",
    var boxSize: String = "-"
) : Comparable<BoardGame> {
    fun info(): String {
        return " \n" +
                "Количество игроков: $capacity, Возраст: $age,\n" +
                "Время: $time, Размер коробки: $boxSize."
    }

    override fun compareTo(other: BoardGame): Int {
        return this.name.compareTo(other.name)
    }
}
