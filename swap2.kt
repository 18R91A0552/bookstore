fun main() {
    println("swap two number....")
    println("enter the first number")
    var a: Int = Integer.valueOf(readLine())
    println("Enter second number")
    var b: Int = Integer.valueOf(readLine())
    println("before swap")
    println("a= $a")
    println("b= $b ")

    println("after swap")
    val temp:Int = a
    a=b
    b = temp
    println("a =$a")
    println("b =$b")


}