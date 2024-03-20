package rs.ac.metropolitan.cs330_dz04

class Predmeti:Registracija
{
    val lista= mutableListOf<Predmet>()

    override fun registruj(s: Student, p: Predmet) {
        println("Student ${s.ime} ${s.prezime} je uspesno prijavljen na predmet ${p.naziv}")
        lista.add(p)
    }

    override fun odjavi(s: Student, p: Predmet) {
        println("Student ${s.ime} ${s.prezime} je uspesno odjavljen sa predmeta ${p.naziv}")
        lista.remove(p)
    }

    fun dodajPredmet(predmet: Predmet) {
        lista.add(predmet)
    }

    fun getPredmeti(): List<Predmet> {
        return lista.toList()
    }
}