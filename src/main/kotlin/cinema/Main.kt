package cinema

val ANTALL_SETER_I_LITEN_SAL = 60

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

// TODO: Bør flytte til en Sete klasse hvor man får beregnet pris på sete
fun beregnPrisPåSete(antallRader: Int, antallSeter: Int, valgtRad: Int): Int {
    val totaleSeter = antallRader * antallSeter

    val billettpris: Int

    if (totaleSeter <= ANTALL_SETER_I_LITEN_SAL) {
        billettpris = 10
        return billettpris
    } else {
        val raderForran = delSalITo(antallRader)

        val erSeteForran = valgtRad <= raderForran
        val billettPris = if (erSeteForran) 10 else 8

        return billettPris
    }
}

// TODO: Info om sete er forran eller ikke får man vite når man oppretter et sete i sal, så denne er ikke nødvendig
fun delSalITo(rader: Int): Int {
    val raderForran = rader / 2
    return raderForran
}