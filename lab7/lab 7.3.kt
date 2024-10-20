fun calculatePoints(wins: Int, draws: Int, losses: Int): Int {
    var pointsWin = wins * 3;
    var pointsDraw = draws;

    return pointsWin + pointsDraw;
}

fun main() {
    var wins = 5
    var draws = 2
    var losses = 3
    var totalPoints = calculatePoints(wins, draws, losses)
    println("Команда набрала $totalPoints очков: ")
}
