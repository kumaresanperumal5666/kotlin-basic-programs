package apinotes.general

import java.util.*

class PalindromeNumbers {

    fun doPalindrome() {
        var n: Int
        var data: Int
        var rem: Int
        var rev: Int = 0


        print("Enter ur value for data:")
        var reader = Scanner(System.`in`)
        data = reader.nextInt()
        n = data;

        /* find the reverse for the given input */
        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        print("Given data and its reverse is  $data $rev");


        if (data == rev)
            print("The given number is a palindrome");
        else
            print("Given number is not a palindrome");
    }

}

fun main(args: Array<String>) {
     var palin = PalindromeNumbers()
    palin.doPalindrome()
}