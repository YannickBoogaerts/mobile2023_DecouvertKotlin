package be.technifutur.decouvertekotlin.fonction

var maFonction: (Int, Int) -> Boolean = { a, b -> a < b }

fun Divise(nb1: Int, nb2: Int): Boolean {
    return nb1 % nb2 == 0
}

fun main() {
    maFonction = { a, b -> a > b }
    test(maFonction)
    maFonction = ::Divise
    test(::Divise)
    test({ i, j -> i == j })
    test() { i, j -> i < j }
    test { i, j -> i == 2 * j }
}

fun test(fct: (Int, Int) -> Boolean): Unit {
    val flag : Boolean = fct(5, 4)
    val message:String

    if (flag )
        message = "ok"
    else
        message = "ko"

    println(message)
}