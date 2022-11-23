package com.example.udemykotlincourse

//    UInt = Unsigned (somente positivo)
//    var = mutável
//    val = imutavel
//    *usar val é uma boa prática – mais previsível
//
//    Funções em única linha
//    Fun divisão(a: Float, b: Float) = a/b


/*when is equivalent to switch
    when(cargo){
        "Gerente" -> 2000f
        "Colaborador" -> 100f
        else -> 500f
    }
*/


fun main() {
//    yearTranform(2)
//    println("Count char of teste: ${countChar("teste")}")
//    println("Cube of 3 = ${cubeNum(3)}")
//    println("15 miles is equals to ${convertMiles(15.0)} km")

    println("${ex1()} balões de água de 7 litros")


}



fun yearTranform(years: Int){
    val months = years * 12
    val days = years * 365
    val hours = days * 24
    val minutes = hours * 60

    println("$years years is equals to $months monts, $days days, $hours hours and $minutes minutes")

}

fun countChar(string: String) = string.length

fun cubeNum(num: Int) = num * num * num

fun convertMiles(miles: Double) = miles * 1.6

fun testFor(): Unit{
    for(i in 0..10){
        //imprime o 10 também
    }

    for(i in 0 until 10){
        //imprime até 9
    }

    val teste= "goisfdjgofdg"
    for(ch in teste){
        //equivalent to for:it
    }
}


fun ex1(): Int{
    var i = 0;
    var count= 0;
    while(i < 2000){
        i+= 7
        count++
    }

    return count-1
}

