package com.example.udemykotlincourse



//optional parameters
fun address(street: String, neighboor: String = "Bosque Sul"){
    //neighboor parameter is optional - has a default value
}


//amount of parameters - vararg
fun average(vararg notas: Double): Double{
    var sum = 0.0;
    for(n in notas){
        sum += n
    }

    return sum/notas.size
}

//generics - T is a convention - it can be any letter
fun <T> f_generics(vararg par: T): Double{
    var sum = 0.0;
    for(n in par){
        if(n is Double){ // I have to deal with the type
            sum += n
        }
    }

    return sum/par.size
}


//Any: it's the superclass of anything: String, Double, etc
fun calc(value: Any){
    //I can pass any type to this function
}

//Unit: equivalent to void

//Nothing: used to throws Exception usually - not so used
fun calc2(value: Any): Nothing{
    TODO("I did not have time to implement")
}











fun main() {
    println("Média: ${average(10.0, 8.0, 9.0, 10.0)}")
}