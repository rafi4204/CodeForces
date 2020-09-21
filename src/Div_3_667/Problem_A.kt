package Div_3_667

import java.util.*
import kotlin.math.abs


fun main(){
    val scan = Scanner(System.`in`)
    //val s = scan.nextLine().toString()
    var t = scan.nextLine().toInt()
    while(t>0){
     t--
        val a = scan.nextLine().split(" ")

       val dif= abs(a[0].toInt()-a[1].toInt())
        var res= dif/10
        if(dif%10!=0)
            res++

       println(res)
    }
}