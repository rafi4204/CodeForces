package Div_2_666

import java.util.*


fun main() {
    val scan = Scanner(System.`in`)
    val s = scan.nextLine().toString()
    var t = s.toInt()
    var flag = true
    while (t > 0) {
        t--
        val n = scan.nextLine().toInt()
        var nn=n
        var fSt = ""
        flag = true
        while (nn > 0) {
            nn--
            val st = scan.nextLine().toString()
            fSt += st
        }
        val ar = fSt.split("")
        val map = mutableMapOf<String, Int?>()
        ar.forEach {
            if (map[it] == null)
                map[it] = 1
            else
                map[it] = map[it]?.plus(1)
        }
        map.forEach { (t, u) ->
            if (u != null) {
                if (u % n != 0 && t!="") {
                    flag = false
                }
            }
        }
        if (flag)
            println("YES")
        else
            println("NO")
    }

}