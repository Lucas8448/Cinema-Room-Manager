package cinema

fun main() {
    println("Enter the number of rows: ")
    val antallRader = readln().toInt()
    println("Enter the number of seats in each row: ")
    val antallSeter = readln().toInt()

    val sal = Sal(antallSeter, antallRader)
    sal.printSal()

    println("Enter a row number: ")
    val valgtRad = readln().toInt()
    println("Enter a seat number in that row: ")
    val valgtSete = readln().toInt()


    val billettPris = beregnPrisPåSete(antallRader, antallSeter, valgtRad)
    println()
    println("Ticket price: $$billettPris")


    sal.bestillSete(valgtRad, valgtSete)
    sal.printSal()
}

fun beregnPrisPåSete(antallRader: Int, antallSeter: Int, valgtRad: Int): Int {
    val totaleSeter = antallRader * antallSeter

    val billettpris: Int

    if (totaleSeter <= 60) {
        billettpris = 10
        return billettpris
    } else {
        val raderForran = delSalITo(antallRader)

        val erSeteForran = valgtRad <= raderForran
        val billettPris = if (erSeteForran) 10 else 8

        return billettPris
    }
}

fun delSalITo(rader: Int): Int {
    val raderForran = rader / 2
    return raderForran
}