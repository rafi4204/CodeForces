package education

import java.util.*

class SuffixArray {
}

fun main(){
    val scan = Scanner(System.`in`)
    var s=scan.nextLine().toString()
    s=  "${s}$"

    var charMap= arrayListOf<Pair<Char,Int>>()
    for((index,value)in s.withIndex())charMap[index]=Pair(value,index)
    //Collections





}