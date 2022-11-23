package com.example.udemykotlincourse

//inheritance

open class Pessoas(var nome: String){

    open fun falar(){
        println("Falar")
    }
}


class PessoaJuridica(cnpj: String, nome: String): Pessoas(nome){

    override fun falar(){
        super.falar()
        println("Jurídica")
    }
}



//Object and Companion Object*************************************************************************************

class Matematica{
    companion object{ //similar to static -- just exists 1 per class
        val PI = 3.14
        fun teste(){

        }
    }

    object obj1{ //needs to have a name -- I can have more than 1 per class
        val EULER= 1.32343
    }

    object obj2{
        fun teste2(){

        }
    }

}



fun main() {
    var pessoaJuridica= PessoaJuridica("", "Hiago")
    println(pessoaJuridica.nome)

    pessoaJuridica.falar()

    Matematica.PI
    Matematica.teste()
    Matematica.obj1.EULER
    Matematica.obj2.teste2()
}


//Abstract Class and Interface************************************************************************************************************

abstract class Mamifero(val nome: String){

    abstract fun andar()
}

interface Domestico{
    fun obedecer() //it can have body
}

class Cachorro(nome: String): Mamifero(nome), Domestico {

    override fun andar() {
        TODO("Not yet implemented")
    }

    override fun obedecer() {
        TODO("Not yet implemented")
    }
}

//anonymous class -- class 81

