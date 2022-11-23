package com.example.udemykotlincourse

//like Java, has a default empty constructor
//primary constructor can be put in the class declaration - but body is not allowed
class Example(var espec: String){

}

//normal
class Pessoa{

    var nome: String

    constructor(){
        nome= "Teste de construtor"
    }

    fun comer(){

    }
}


//example with init == initializer
//order: primary constructor -> init -> secondary constructor
class Animal{

    var nome: String= ""
//    get() {
//        return field
//    }
//    set(value) {
//        field= value
//    }

    //Kotlin does the getter and setter in the background for the developer, but I can implement it if I want (I have to use the term 'field')

}



enum class Prioridade{
    BAIXA, MEDIA, ALTA
}


data class TesteData(val a: String){
    //equals, toString and hashCode object methods are related to the atributtes and not to the memory reference as in normal Class -- class 71
    //data class has a copy method -> copying object values obj1 to obj2
}







//*****************************************************

fun main() {
    val obj1: Pessoa = Pessoa()
    println(obj1.nome)

    val objExample = Example("teste")

    Prioridade.BAIXA

}