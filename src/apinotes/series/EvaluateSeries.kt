package apinotes.series

import java.util.*

class EvaluateSeries {

    fun EvaluateSeries() {
        var i: Int = 0
        var n: Int
        var sum: Float = 0.0F

        print("Enter the value for n:");
        var reader = Scanner(System.`in`)
        n = reader.nextInt()

        for (i in 1..n step 1) {
            sum = sum + (1.0F / i)
        }

        print("Output: " + sum)

    }


}

fun main(args: Array<String>) {
    var evaluate = EvaluateSeries()
    evaluate.EvaluateSeries()

}
