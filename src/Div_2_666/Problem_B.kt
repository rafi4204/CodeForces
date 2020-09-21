package Div_2_666

import java.util.*
import kotlin.math.pow


/*fun List<String>.toInt(): MutableList<Int> {
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
}*/

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().toInt()
    val ar = scan.nextLine().split(" ").toLong()
     ar.sort()

    var i:Long=1
    var min=99999999999

   while(Math.pow(i.toDouble(),(n-1).toDouble()).toBigDecimal() <=(ar[n-1]+ countMinCost(1,n,ar)).toBigDecimal()){
        min= kotlin.math.min(min,countMinCost(i,n,ar))
       i++
       if(n>=50)
           break
   }
    println(min)
}

fun countMinCost(i: Long, n:Int, ar: MutableList<Long>): Long {
    var cost:Long=0
    var j=0
    ar.forEach {
        cost+= kotlin.math.abs((i.toDouble().pow(j.toDouble())).toLong() - it)

        j++
    }
    return cost

}

