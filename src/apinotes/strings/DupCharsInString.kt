package apinotes.strings

import com.sun.org.apache.bcel.internal.generic.DUP

class DupCharsInString {

    fun findDupsInString() {
        var str = "how are you"
        var map = HashMap<String, Int>()
        str.trim()
        for (i in 0..str.length - 1 step 1) {
            var count: Int = 0
            for (j in 0..str.length - 1 step 1) {
                if (str.get(i) == str.get(j)) {
                    count++
                }
            }
            map.put(str.get(i) + "", count)
        }
        map.forEach { key, value -> if (key != " ") println("$key = $value") }

    }
}

fun main(args: Array<String>) {
    var dups = DupCharsInString()
    dups.findDupsInString()
}