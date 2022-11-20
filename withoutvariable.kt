    fun main(){
    println("swap two numbers without variable.....")
    println("enter first number")
    var a:Int = Integer.valueOf(readLine())
    println("enter second number")
    var b:Int= Integer.valueOf(readLine())
    println("before swap")
    println("first number a = $a")
    println("first number b = $b")
    a=a+b
    b=a-b
    a=a-b
    println("after swap")
    println("first number a = $a")
    println("second number b = $b")



}