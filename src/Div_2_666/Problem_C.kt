package Div_2_666

import java.util.*


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
    val n = scan.nextLine().toInt()
    var ar =scan.nextLine().split(" ").toLong()

    when(n){
        1->{
            println("1 1")
            println(-ar[0])
             println("1 1")
            println(0)
             println("1 1")
            println(0)

        }

        else->{
            println("1 1")
            println(-ar[0])
            println("1 $n")
            print("0 ")
            for(i in 1 until n){
                print("${(-n)*ar[i]} ")

            }
            println()
            println("2 $n")
            for(j in 1 until n){
                print("${(n-1)*ar[j]} ")
            }
        }
    }

}

