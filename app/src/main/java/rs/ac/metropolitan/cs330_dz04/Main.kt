package rs.ac.metropolitan.cs330_dz04
import java.util.Random

fun main() {
    val predmeti = Predmeti()
    val predmet1 = Predmet("CS330", "Razvoj mobilnih aplikacija", 8, 4, true)
    val predmet2 = Predmet("CS101", "Uvod u OO programiranje", 6, 1, true)
    val predmet3 = Predmet("CS230", "Distribuirani sistemi", 7, 3, true)

    predmeti.dodajPredmet(predmet1)
    predmeti.dodajPredmet(predmet2)
    predmeti.dodajPredmet(predmet3)

    val studenti = listOf(
        Student(1234, "Pera", "Peric", emptyList()),
        Student(5678, "Mika", "Mikic", emptyList()),
        Student(9012, "Laza", "Lazic", emptyList())
    )

    val rand= Random()

    studenti.forEach { student ->
        val randomPredmeti = mutableListOf<Predmet>()
        repeat(rand.nextInt(3) + 1) {
            randomPredmeti.add(predmeti.getPredmeti().random())
        }
        randomPredmeti.forEach { predmet ->
            predmeti.registruj(student, predmet)
        }
        repeat(rand.nextInt(2) + 1) {
            val odjavljenPredmet = randomPredmeti.random()
            predmeti.odjavi(student, odjavljenPredmet)
            randomPredmeti.remove(odjavljenPredmet)
        }
    }
}