package apinotes.general

import java.util.*

class AddTwoNumsWithoutThirdVar {


    fun addTwoNumbers() {
        var n1: Int
        var n2: Int

        print("Enter your first number:");
        var reader = Scanner(System.`in`)
        n1 = reader.nextInt()
        print("Enter your second number:");
        n2 = reader.nextInt()

        /* add the given numbers */
        n1 = n1 + n2;
        print("$n1-$n2 $n2 $n1");

    }
}

fun main(args: Array<String>) {
    var add = AddTwoNumsWithoutThirdVar()
    add.addTwoNumbers()
}