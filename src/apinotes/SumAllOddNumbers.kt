package apinotes

import java.util.*

class SumAllOddNumbers {

    fun sumOfAllOddNumbers() {
        var i: Int
        var n: Int
        var sum: Int = 0

        print("Enter the value for n:");
        var reader = Scanner(System.`in`)
        n = reader.nextInt()

        for (i in 1..n step 1) {
            if (i % 2 == 0)
                continue;
            sum = sum + i;
        }
        print("Sum of odd numbers:" + sum);
    }


}

fun main(args: Array<String>) {
    var sum = SumAllOddNumbers()
    sum.sumOfAllOddNumbers()

}