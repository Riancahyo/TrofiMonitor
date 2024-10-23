package trpl.nim234311052.trofimonitor

data class Clubs(
    val name: String,
    val premierLeague: Int?,
    val faCup: Int?,
    val eflCup: Int?,
    val championsLeague: Int?,
    val europaLeague: Int?
) {
    val totalTrophies: Int
        get() = (premierLeague ?: 0) + (faCup ?: 0) + (eflCup ?: 0) + (championsLeague ?: 0) + (europaLeague ?: 0)
}