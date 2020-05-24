

class Entity <T> (title: T, Subtitle: T){  //

    init {
        println("title:" + title + "Subtitle" + Subtitle)
    }
}

fun main (args: Array<String>){
    var man = Entity<String>("bhavesh","jain")
    var mobile = Entity<Int>(12,123)
    var boolen = Entity<Boolean>(true,false)

}