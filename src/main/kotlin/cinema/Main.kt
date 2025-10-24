package cinema

fun main() {
//    println("""
//        Cinema:
//          1 2 3 4 5 6 7 8
//        1 S S S S S S S S
//        2 S S S S S S S S
//        3 S S S S S S S S
//        4 S S S S S S S S
//        5 S S S S S S S S
//        6 S S S S S S S S
//        7 S S S S S S S S
//    """.trimIndent())

    println("Enter the number of rows:")
    val antallRader = readln().toInt()
    println("Enter the number of seats in each row:")
    val antallSeter = readln().toInt()

    val totalInntekt = beregnInntekt(antallRader, antallSeter)

    println("""
        Total income:
        $$totalInntekt
    """.trimIndent())
}

fun beregnInntekt(antallRader: Int, antallSeter: Int): Int {
    val totaleSeter = antallRader * antallSeter

    if (totaleSeter <= 60) {
        return totaleSeter * 10
    } else {
        val (raderForran, raderBak) = delSalITo(antallRader)

        val seterForran = raderForran * antallSeter
        val inntektForran = seterForran * 10

        val seterBak = raderBak * antallSeter
        val inntektBak = seterBak * 8

        return inntektForran + inntektBak
    }
}

fun delSalITo(rader: Int): Pair<Int, Int> {
    val raderForran = rader / 2
    val raderBak = (rader + 1) / 2
    return raderForran to raderBak
}