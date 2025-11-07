package cinema

class Sal(antallSeter: Int, antallRader: Int) {

    private val sal = mutableListOf<MutableList<String>>()

    init {
        for (rad in 0..antallRader) {
            // TODO: Bør være liste av seter og ikke string
            val seterPerRad = mutableListOf<String>()
            for (sete in 0..antallSeter) {
                // TODO: Instansier et sete med om det er forran?, ledig?, posisjonen til setet
                seterPerRad.add("S")
            }
            // TODO: Ender opp med en liste av seter
            sal.add(seterPerRad)
        }

        // TODO: Det er ikke et sete på [0][0] eller første rad og kolonne
        sal[0][0] = " "
        // Bytter ut første rad med 1-antallSeter
        for (sete in 1..antallSeter) {
            sal[0][sete] = sete.toString()
        }
        // TODO: Gi plassene som ikke har seter noe for å slippe å opprette et sete som ikke er et sete
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

    // TODO: Sal må ha en mekanisme for å be sete oppdatere seg
    fun bestillSete(valgtRad: Int, valgtSete: Int) {
        sal[valgtRad][valgtSete] = "B"
    }
}