package be.technifutur.decouvertekotlin.collection

import be.technifutur.decouvertekotlin.classe.Personne
import be.technifutur.decouvertekotlin.classe.Stagiaire
import java.time.LocalDate

fun createListPersonne1():List<Personne>{
    return listOf(
        Personne("Dupont","dede", LocalDate.of(2000,3,12)),
        Stagiaire("Doupont", "Toto", LocalDate.of(2000,3,12),"Police"),
        Stagiaire("Doupont", "Toto", "2000-03-12","Police"),
        Personne("Dubois","Léon","2000-08-19"),
    )
}

fun createMutableList1():MutableList<Personne>{
    return listOf(
        Personne("Dupont","dede", LocalDate.of(2000,3,12)),
        Stagiaire("Doupont", "Toto", LocalDate.of(2000,3,12),"Police"),
        Stagiaire("Doupont", "Toto", "2000-03-12","Police"),
        Personne("Dubois","Léon","2000-08-19"),
    ).toMutableList()
}
fun createMutableList2():MutableList<Personne>{
    return mutableListOf(
        Personne("Dupont","dede", LocalDate.of(2000,3,12)),
        Stagiaire("Doupont", "Toto", LocalDate.of(2000,3,12),"Police"),
        Stagiaire("Doupont", "Toto", "2000-03-12","Police"),
        Personne("Dubois","Léon","2000-08-19"),
    )
}

fun main() {

    var listp = createListPersonne1()
    var copy = listp;
    var listm: MutableList<Personne> = listp.toMutableList()
    val listTest : List<Personne> = listm

    listm.add(Personne("Dubois","Marcel","1999-05-06"))

    listm += listp
    listp += listm

    listm.forEach(::println)
    println()
    listp.forEach(::println)
    println()
    copy.forEach(::println)



}