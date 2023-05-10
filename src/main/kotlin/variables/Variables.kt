package be.technifutur.decouvertekotlin.variables

// 'var' name ':' type = initialiseur
var var1 : String? = "var1"
private var var2 : String = "var2"
var var3 : String = "var3"
    private set

var var1Plus2
    get()= var1+ var2
    set(value) {var1 = value}


var var4 = "var4"

val val1 : Int = 5

val val2
        get()="_"+ var1+ "_"


fun inc(){
   // var4 = 5
    var4 = "toto"
    var1 = "toto"
    var2 = "toto"
    var3 = "toto"
    var1 = null

    val val3:Int
        //get()=5
    //println(val3)
    val3 = 5
    println(val3)
    //val3 = 6
    println(val3)
}
val val3:Int
    get()=5
