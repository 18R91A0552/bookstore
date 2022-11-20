fun main(args: Array<String>) {
    var n = 5
    var t1 = 0
    var t2 = 1
    println("first $n terms: ")
    for(i in 1..n){
        print("$t1 + ")
        val sum = t1 + t2
        t1 = t2
        t2 = sum

    }

}
