fun main() {
    println("Enter Number : ")
    var n = readLine()!!.toInt()
    var result : Int
    result = fact(n)
    println("Factorial of $n = $result")
}

fun fact(n: Int): Int {
    return if(n == 1){
        n
    }
    else {
        n * fact(n-1)
    }
}


