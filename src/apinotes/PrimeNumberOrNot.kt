package apinotes

import java.util.*

class PrimeNumberOrNot {

    fun findPrimeNumberOrNot() {
        var data: Int
        var i: Int
        var flag: Int = 1
        print("Enter ur input:")
        var reader = Scanner(System.`in`)
        data = reader.nextInt()

        if (data <= 1) {
            print("Not a prime number")
            return
        }

        for (i in 2..data - 1 step 2) {
            if (data % i == 0) {
                flag = 0
                break
            }
        }

        if (flag == 0)
            print("Not a prime number");
        else
            print("Prime Number");
    }

}

fun main(args: Array<String>) {
    var prime = PrimeNumberOrNot()
    prime.findPrimeNumberOrNot()
}