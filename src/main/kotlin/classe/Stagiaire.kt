package be.technifutur.decouvertekotlin.classe

import java.time.LocalDate

class Stagiaire(name: String, surname: String, birthday: LocalDate, var formation: String? = null) :
    Personne(name, surname, birthday) {
    constructor(name: String, surname: String, birthday: String, formation: String? = null) : this(
        name,
        surname,
        LocalDate.parse(birthday),
        formation
    )

    val nomComplet = surname + " " + name

    init {
        println("bienvenue $surname")
    }

    override fun toString(): String {
        //println(name)
        return "Stagiaire(ancêtre [${super.toString()}],formation=$formation)"
    }
}

fun main() {
    val stagiaire1 = Stagiaire("Dupont", "Toto", LocalDate.of(2000, 4, 4))
    val stagiaire2 = Stagiaire("Dupond", "dédé", LocalDate.of(2000, 4, 4), "police")
    println(stagiaire1)
}