package nicestring

fun String.isNice(): Boolean {
    var conditions= 0;
    //first condition
    if(!contains("bu") && !contains("ba") && !contains("be")){
        conditions+= 1
    }

    //second condition
    var vowels= 0
    for(ch in this){
        if(ch.equals('a') || ch.equals('e') || ch.equals('i') ||
            ch.equals('o') || ch.equals('u')){
            vowels+= 1;
        }
    }
    if(vowels > 2){
        conditions+= 1
    }

    //third condition
    for(i in 0 until (this.length - 1)){
        if(this[i].equals(this[(i+1)])){
            conditions+= 1
            break
        }
    }

    if(conditions > 1){
        return true
    }else{
        return false
    }
}