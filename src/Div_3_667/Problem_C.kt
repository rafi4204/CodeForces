package Div_3_667

import java.util.*
import kotlin.math.abs
import kotlin.math.min


fun main() {
    val scan = Scanner(System.`in`)
    //val s = scan.nextLine().toString()
    var t = scan.nextLine().toInt()
    var flag =false
    while (t > 0) {
        t--
        val l = scan.nextLine().split(" ")
        val n = l[0].toLong()
        val x = l[1].toLong()
        val y = l[2].toLong()
        //val y = l[3].toLong()
     //   val n = l[4].toLong()

        flag = false
      if((y-x)%(n-1)==0.toLong()){
          for(i in 0 until n){
              print("${x+(i*((y-x)/(n-1)))} ")
          }
          println()
      }
        else if((y-x)<=2.toLong()){
          if(y-(n-1)>=1){
              for(j in 0 until n){
                  print("${y-j} ")
              }
              println()
          }
          else{
              for(j in 1..n){
                  print("$j ")
              }
              println()
          }
      }
        else{

          for(i in (y-x) downTo   1){
              if((y-x)%i==0.toLong() && (y-((n-1)*((y-x)/i)))>=1&& (y-((n-1)*((y-x)/i)))<=x){
                  for(j in 0 until n){
                      print("${y-(j*((y-x)/i))} ")
                  }
                  println()
                  flag=true

              }
              if(flag)
                  break
          }
          if(!flag) {
              for (i in (y - x) downTo 1) {
                  for (k in 1 until x) {
                      if ((y - x) % i == 0.toLong() && (x - k) % ((y - x) / i) == 0.toLong() && (x - k) / ((y - x) / i) <= n && (y - k) % ((y - x) / i) == 0.toLong() && (y - k) / ((y - x) / i) <= n) {
                          for (j in 0 until n) {
                              print("${k + (j * ((y - x) / i))} ")
                          }
                          println()
                          flag = true

                      }
                      if (flag)
                          break
                  }
                  if (flag)
                      break
              }
          }
          if(!flag) {
              for (i in (y - x) downTo  1) {
                  if ((y - x) % i == 0.toLong()&& (x+((n-1)*((y-x)/i)))>=y) {
                      for (j in 0 until n) {
                          print("${x + (j * ((y - x) / i))} ")
                      }
                      println()
                      flag = true
                  }
                  if (flag)
                      break
              }
          }
      }

    }
}