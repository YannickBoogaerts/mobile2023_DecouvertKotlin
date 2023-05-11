package be.technifutur.decouvertekotlin.classe

import java.time.LocalDate

open class Personne(val nom:String,val prenom:String, val naissance:LocalDate) {
    constructor(nom: String,prenom: String,naissance: String):this(nom,prenom,LocalDate.parse(naissance))
    val age
        get() = naissance.until(LocalDate.now()).years
    override fun toString(): String {
        return "Personne(nom='$nom', prenom='$prenom', " +
                "naissance=${naissance.dayOfMonth}/${naissance.month}/${naissance.year})"
    }
}

fun main() {
    val toto = Personne(
        prenom="Toto",
        nom ="Dupont",
        naissance = LocalDate.of(2000,5,9),
    )

    val dede = Personne(
        prenom="Toto",
        nom ="Dupont",
        naissance = LocalDate.of(2000,5,9),
    )

    println(toto)
    println(toto.prenom)
    println(toto.naissance)
    println(toto.age)
    println(toto == dede)
    println(toto.equals(dede))
}