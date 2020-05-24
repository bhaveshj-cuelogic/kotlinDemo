// same as optional in swift, used to eliminate the risk of null reference from the code.


fun main(args: Array<String>){
//    A variable of type String can not hold null.
//    If we try to assign null to the variable, it gives compiler error.
    var str: String? = "Hello" // variable is declared as nullable
    str = null
    print(str)
    safeCast() // safe cast example
    safeCastingOperater() // as?
    elvisOperaterUseCase() //  if value is null then print place holder value
    castWithExclimation()
}

fun castWithExclimation(){ 
    var string: String? = "Hello!"
    print(string)
//    if(string != null) { // smart cast
//        print(string.length) // It works now!
//    }
}

fun safeCast(){ // safely get the value
    var string: String? = "Hello!"
    if(string != null) { // smart cast
        print(string.length) // It works now!
    }
}

//Kotlin provides a safe cast operator as? for safely cast to a type.
// It returns a null if casting is not possible rather than throwing an ClassCastException exception.

fun safeCastingOperater(){
    val location: Any = "stringValue"
    val safeString: String? = location as? String
    val safeInt: Int? = location as? Int
    println(safeString) // this will print output "stringValue"
    println(safeInt) // this will print "null"
}

// Elvis operator (?:) is used to return the not null value even the conditional expression is null.
// It is also used to check the null safety of values.

fun elvisOperaterUseCase(){

    var str: String? = null
    var str2: String? = "StringValueToPrint"
    var length1:  Int = str ?.length ?: -1
    var length2:  Int = str2 ?.length ?:  -1

    println("Length of str is ${length1}")
    println("Length of str2 is ${length2}")

}