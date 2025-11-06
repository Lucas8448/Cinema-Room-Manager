import cinema.beregnPrisPåSete
import cinema.delSalITo
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    fun `7 rader, 8 seter, rad 3 skal gi billettPris 10`() {
        val billettPris = beregnPrisPåSete(7, 8, 3)
        assertEquals(10, billettPris)
    }


    @Test
    fun `8 rader, 9 seter, rad 6 skal gi billettPris 8`() {
        val billettPris = beregnPrisPåSete(8, 9, 6)
        assertEquals(8, billettPris)
    }

    @Test
    fun `8 rader, 9 seter, rad 1 skal gi billettPris 10`() {
        val billettPris = beregnPrisPåSete(8, 9, 1)
        assertEquals(10, billettPris)
    }

    @Test
    fun `8 rader, 9 seter, rad 4 skal gi billettPris 10`() {
        val billettPris = beregnPrisPåSete(8, 9, 4)
        assertEquals(10, billettPris)
    }
}