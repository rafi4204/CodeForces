package Div_3_667


import java.util.*
import kotlin.math.abs
import kotlin.math.min


fun main() {
    val scan = Scanner(System.`in`)
    //val s = scan.nextLine().toString()
    var t = scan.nextLine().toInt()
    while (t > 0) {
        t--
        val l = scan.nextLine().split(" ")
        val a = l[0].toLong()
        val b = l[1].toLong()
        val x = l[2].toLong()
        val y = l[3].toLong()
        val n = l[4].toLong()
         var mn : Long =1000000000000000000
        if ((a - n)<x && (b-(x-(a-n)))<y) {
            mn= min(x*y,mn)
        }
        if ((a - n)<x && (b-(x-(a-n)))>=y) {
            mn= min(x*(b-(x-(a-n))),mn)
        }
        if ((a - n)>=x ) {
            mn= min((a - n)*b,mn)
        }

      if ((b - n)<y && (a-(y-(b-n)))<x) {
            mn= min(x*y,mn)
        }
        if ((b - n)<y && (a-(y-(b-n)))>=x) {
            mn= min(y*(a-(y-(b-n))),mn)
        }
        if ((b - n)>=y ) {
            mn= min((b - n)*a,mn)
        }



        println(mn)
    }
}