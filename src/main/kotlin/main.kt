fun main() {
    val time = 60 * 60 * 5
    println(agoToText(time))
}

fun agoToText(time: Int) = when (time) {
    in 60 downTo 0 -> "был(а) только что"
    in 60 * 60 downTo 60 + 1 -> "был(а) в сети ${time / 60} ${minuteEnd(time / 60)} назад"
    in 24 * 60 * 60 downTo 60 * 60 + 1 -> "был(а) в сети ${time / 3600} ${hourEnd(time / 3600)} назад"
    in 24 * 60 * 60 * 2 downTo 24 * 60 * 60 + 1 -> "был(а) в сети сегодня"
    in 24 * 60 * 60 * 3 downTo 24 * 60 * 60 * 2 + 1 -> "был(а) в сети вчера"
    else -> "был(а) в сети давно"
}

fun minuteEnd(time: Int) = when (time % 10) {
    1 -> "минуту"
    2, 3, 4 -> "минуты"
    else -> "минут"
}

fun hourEnd(time: Int) = when (time % 10) {
    1 -> "час"
    2, 3, 4 -> "часа"
    else -> "часов"
}