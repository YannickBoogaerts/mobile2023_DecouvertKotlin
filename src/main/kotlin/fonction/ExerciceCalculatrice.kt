package be.technifutur.decouvertekotlin.fonction

import java.util.Scanner

fun <T> saisie(message: String, parser: (String) -> T?): T {
    val scan = Scanner(System.`in`)
    print(message)
    var retour: T? = parser(scan.nextLine())
    while (retour == null) {
        print("entrée non valide - $message")
        retour = parser(scan.nextLine())
    }
    return retour
}

fun addition(a: Int, b: Int): Int {
    return a + b
}

fun op(texte: String): ((Int, Int) -> Int)? =
    if (texte.length == 0)
        null
    else
        when (texte[0]) {
            '+' -> ::addition
            '-' -> { a, b -> a - b }
            '*' -> { a, b -> a * b }
            '/' -> { a, b -> a / b }
            else -> null
        }

fun op1(texte: String): ((Int, Int) -> Int)? {
    var retour: ((Int, Int) -> Int)?
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

fun op2(texte: String): ((Int, Int) -> Int)? {
    var retour: ((Int, Int) -> Int)?
    if (texte.length != 1)
        retour = null
    else
        retour = when (texte[0]) {
            '+' -> { a, b -> a + b }
            '-' -> { a, b -> a - b }
            '*' -> { a, b -> a * b }
            '/' -> { a, b -> a / b }
            else -> null
        }
    return retour
}

fun op3(texte: String): ((Int, Int) -> Int)? {
    var retour: ((Int, Int) -> Int)? =
        if (texte.length != 1)
            null
        else
            when (texte[0]) {
                '+' -> { a, b -> a + b }
                '-' -> { a, b -> a - b }
                '*' -> { a, b -> a * b }
                '/' -> { a, b -> a / b }
                else -> null
            }
    return retour
}

fun op4(texte: String): ((Int, Int) -> Int)? {
    return if (texte.length != 1)
        null
    else
        when (texte[0]) {
            '+' -> { a, b -> a + b }
            '-' -> { a, b -> a - b }
            '*' -> { a, b -> a * b }
            '/' -> { a, b -> a / b }
            else -> null
        }
}


fun main() {
    println(
        saisie("opération (+, -, *, /): ", ::op)(
            saisie("premier Nombre: ") { s -> s.toIntOrNull() },
            saisie("deuxieme Nombre: ") { s -> s.toIntOrNull() }
        )
    )
}

fun main1() {
    val saisieOp = saisie("opération (+, -, *, /): ", ::op)
    val saisieNb1 = saisie("premier Nombre: ") { s -> s.toIntOrNull() }
    val saisieNb2 = saisie("deuxieme Nombre: ") { s -> s.toIntOrNull() }
    val result = saisieOp(saisieNb1, saisieNb2)
    println(result)
}
