package be.technifutur.decouvertekotlin

import be.technifutur.decouvertekotlin.variables.var1
import be.technifutur.decouvertekotlin.variables.var1Plus2
//import be.technifutur.decouvertekotlin.variables.var2//Cannot access 'var2': it is private in file
import be.technifutur.decouvertekotlin.variables.var3

fun main() {
    println(var1)
    //println(var2)
    println(var3)
    var1 += " modif"
    //var3 += " modif" //Cannot assign to 'var3': the setter is private in file

    println(var1Plus2)
    var1Plus2="toto"
    println(var1Plus2)
}