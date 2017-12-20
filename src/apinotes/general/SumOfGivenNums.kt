package apinotes.general

import java.util.*

class SumOfGivenNums {

    fun sumOfGivenNums() {
        var n: Int
        var rem: Int
        var sum: Int = 0

        /* get the input from the user */
        print("Enter the value for n:")
        var reader = Scanner(System.`in`)
        n = reader.nextInt()

        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        print("Sum of digits: "+ sum)
    }

}

fun main(args: Array<String>) {
    var sum  = SumOfGivenNums()
    sum.sumOfGivenNums()
}