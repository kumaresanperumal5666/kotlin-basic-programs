package apinotes

import java.util.*

class SumOfEvenNumbers {

    fun SumOfEvenNumbers() {
        var n: Int
        var i: Int
        var sum: Int = 0
        print("Enter the value for n:")
        var reader = Scanner(System.`in`)
        n = reader.nextInt()

        for (i in 1..n step 1) {
            if (i % 2 != 0)
                continue;
            sum = sum + i
        }
        print("Output: " + sum)
    }
}

fun main(args: Array<String>) {
    var even = SumOfEvenNumbers()
    even.SumOfEvenNumbers()
}