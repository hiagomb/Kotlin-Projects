package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    var rightPos= 0;
    var wrongPos= 0;
    var excludeList= listOf<Int>()

    for(i in 0 until guess.length){
        var count= 0
        for(j in 0 until secret.length){
            if(!excludeList.contains(j)){
                if(guess.get(i).equals(secret.get(j))){
                    if(guess.get(i).equals(secret.get(i)) && !excludeList.contains(i)){
                        rightPos+= 1
                        excludeList+= listOf(i)
                    }else{
                        if(guess.get(j).equals(secret.get(j))){
                            rightPos+= 1
                        }else{
                            wrongPos+= 1
                        }
                        excludeList+= listOf(j)
                    }
                    break
                }
            }
        }
    }


    return Evaluation(rightPos, wrongPos)
}
