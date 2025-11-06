package cinema

class Sal(antallSeter: Int, antallRader: Int) {

    val sal = mutableListOf<MutableList<String>>()

    init {
        for (rad in 0..antallRader) {
            val seterPerRad = mutableListOf<String>()
            for (sete in 0..antallSeter) {
                seterPerRad.add("S")
            }
            sal.add(seterPerRad)
        }

        sal[0][0] = " "
        // Bytter ut første rad med 1-antallSeter
        for (sete in 1..antallSeter) {
            sal[0][sete] = sete.toString()
        }
        // Bytter ut første kolonne med 1-antallRader
        for (rad in 1..antallRader) {
            sal[rad][0] = rad.toString()
        }
    }

    fun printSal() {
        println()
        println("Cinema:")
        // Printer salen rad for rad
        for (rad in sal) {
            println(rad.joinToString(" "))
        }
        println()
    }

    fun bestillSete(valgtRad: Int, valgtSete: Int) {
        sal[valgtRad][valgtSete] = "B"
    }
}