import cinema.beregnInntekt
import cinema.delSalITo
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {

    // beregnInntekt
    @Test
    fun `4 rader og 5 seter skal bli 200$`() {
        val inntekt = beregnInntekt(4, 5)
        assertEquals(200, inntekt)
    }
    @Test
    fun `8 rader og 9 seter skal bli 648$`() {
        val inntekt = beregnInntekt(8, 9)
        assertEquals(648, inntekt)
    }
    @Test
    fun `9 rader og 7 seter skal bli 560$`() {
        val inntekt = beregnInntekt(9, 7)
        assertEquals(560, inntekt)
    }

    // delSalITo
    @Test
    fun `9 rader blir delt i 4 forran og 5 bak`() {
        val (raderForran, raderBak) = delSalITo(9)
        assertEquals(4, raderForran)
        assertEquals(5, raderBak)
    }
    @Test
    fun `10 rader blir delt i 5 forran og 5 bak`() {
        val (raderForran, raderBak) = delSalITo(10)
        assertEquals(5, raderForran)
        assertEquals(5, raderBak)
    }
    @Test
    fun `1 rader blir delt i 0 forran og 1 bak`() {
        val (raderForran, raderBak) = delSalITo(1)
        assertEquals(0, raderForran)
        assertEquals(1, raderBak)
    }

}