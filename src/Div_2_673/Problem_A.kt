package Div_2_673

import java.util.*
import kotlin.math.abs
import kotlin.math.min
fun List<String>.toInt(): MutableList<Int> {
    val a= mutableListOf<Int>()
    this.forEach {
        a.add(it.toInt())
    }
    return a
}
fun List<String>.toLong(): MutableList<Long> {
    val a= mutableListOf<Long>()
    this.forEach {
        a.add(it.toLong())
    }
    return a
}

fun main() {
    val scan = Scanner(System.`in`)
    //val s = scan.nextLine().toString()
    var t = scan.nextLine().toInt()
    while (t > 0) {
        t--
        val l = scan.nextLine().split(" ")
        val n = l[0].toLong()
        val k = l[1].toLong()
        val ar = scan.nextLine().split(" ").toLong()

       // var mn : Long =1000000000000000000
    ar.sort()
        val mn=ar[0]
        var res=0.toLong()
        var count=0
        ar.forEach {
            if(count!=0)
           res += (k-it)/mn
            count++
        }
        println(res)



    }
}