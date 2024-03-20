package rs.ac.metropolitan.cs330_dz04

data class Student(val index:Int,val ime:String,val prezime:String,val predmeti: List<Predmet>)
{
    override fun toString(): String {
        return "$index $ime $prezime"
    }
}
