package rs.ac.metropolitan.cs330_dz04

data class Predmet(val sifra:String,val naziv:String,val esbp:Int,val semestar:Int,val obavezan:Boolean)
{
    override fun toString(): String {
        return "$sifra-$naziv ESP:$esbp semestar:$semestar (${if (obavezan) "obavezan" else "izborni"})"
    }
}