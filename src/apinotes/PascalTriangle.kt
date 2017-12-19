package apinotes

import java.util.*

class PascalTriangle{

    fun printPasacleTriangle(){
        var n: Int
        var i: Int = 0
        var j: Int
        var data: Int

        print("Enter the no of line:");
        var reader = Scanner(System.`in`)
        n = reader.nextInt()

        for( n in i>0 step-1){

        }
        for (i = n; i > 0; i--) {

            data = i;

            /* space at the front of triangle */
            for (j = i; j > 0; j--) {
            printf("   ");
        }

            /* print values of first half of triangle */
            for (j = n; j >= i; j--) {
            printf("%3d", data++);
        }

            data = data - 2;

            /* print values of second half of triangle */
            for (j = n; j > i; j--) {
            printf("%3d", data--);
        }

            printf("\n");
        }
    }
}

fun main(args: Array<String>){

}