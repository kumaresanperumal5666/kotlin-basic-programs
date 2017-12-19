package apinotes

import java.util.*

class ReverseNumbers {
    fun reverseNumbers() {
        var data: Int
        var mod: Int
        var res: Int = 0
        print("Enter the value for data:");
        var reader = Scanner(System.`in`)
        data = reader.nextInt()

        while (data > 0) {
            mod = data % 10
            res = (res * 10) + mod
            data = data / 10
        }

        print("Reverse of the given number:" + res)
    }
}

fun main(args: Array<String>) {
    var reverse = ReverseNumbers()
    reverse.reverseNumbers()

}