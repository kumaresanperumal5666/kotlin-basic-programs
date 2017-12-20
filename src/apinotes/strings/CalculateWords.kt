package apinotes.strings

class CalculateWords{
    fun calculateWords(){
        var str = "kotlin is very good language"
        var split = str.split(" ")
        println(" After splitting : "+ split.size)
    }
}

fun main(args: Array<String>){
    var calculate = CalculateWords()
    calculate.calculateWords()
}
