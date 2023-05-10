package be.technifutur.decouvertekotlin.fonction

import java.util.Scanner

fun <T> saisie(message: String, parser: (String) -> T?): T {
    val scan = Scanner(System.`in`)
    print(message)
    var retour:T? = parser(scan.nextLine())
    while (retour == null) {
        print("entrée non valide - $message")
        retour = parser(scan.nextLine())
    }
    return retour
}

fun op(texte: String): ((Int, Int) -> Int)? =
    if (texte.length == 0)
        null
    else
        when (texte[0]) {
            '+' -> { a, b -> a + b }
            '-' -> { a, b -> a - b }
            '*' -> { a, b -> a * b }
            '/' -> { a, b -> a / b }
            else -> null
        }

fun op1(texte: String): ((Int, Int) -> Int)? {
    var retour :((Int, Int) -> Int)?
    if (texte.length != 1)
        retour = null
    else
        when (texte[0]) {
            '+' -> retour = { a, b -> a + b }
            '-' -> retour = { a, b -> a - b }
            '*' -> retour = { a, b -> a * b }
            '/' -> retour = { a, b -> a / b }
            else -> retour = null
        }
    return retour
}


fun main() {
    println(
        saisie("opération (+, -, *, /): ", ::op)(
            saisie("premier Nombre: ") { s -> s.toIntOrNull() },
            saisie("deuxieme Nombre: ") { s -> s.toIntOrNull() }
        )
    )
}