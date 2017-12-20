package apinotes.series

class FibonacciSeries {

    fun findFibonacciSeries() {
        var n1: Int = 0
        var n2: Int = 1
        var n3: Int
        var i: Int
        var count: Int = 10

        for (i in 2..count step 1) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

fun main(args: Array<String>) {
    var fib = FibonacciSeries()
    fib.findFibonacciSeries()
}