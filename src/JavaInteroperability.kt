import MyJavaClass

fun main(args: Array<String>) {
    val sum= MyJavaClass.sum(1,5) // calling java class file from kotlin
    println("printing sum inside Kotlin file: "+sum)

    val myJava = MyJavaClass()

    myJava.lastName = "Kumar"
    myJava.setfirstName("Arjun")

    println("accessing value using property: "+myJava.firstName)
    println("accessing value using property: "+myJava.lastName)

    println("accessing value using method: "+myJava.getfirstName())
    println("accessing value using method: "+myJava.getlastName())

}

fun calculateAreaUsingKotlin(l: Int,b: Int):Int{
    return l*b
}