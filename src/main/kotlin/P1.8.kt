import java.util.*

fun main() {
    var a = arrayOf(12,10,13,20)
    println("Array-1 by using arrayof() : "+Arrays.deepToString(a))

    var b = IntArray(5)
    b[0]=10
    b[1]=15
    b[2]=20
    b[3]=25
    b[4]=30
    for (i in b){
        print(i)
    }
    println("")
    var c = intArrayOf(1,2,3,4,5)
    for (j in c) {
        print(j)
    }

}