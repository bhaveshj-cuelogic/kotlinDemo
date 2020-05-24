
interface InputHandler{
    fun clicked()
}

class Touch: InputHandler{
    override fun clicked() {
        println("Touch clicked")
    }

}
fun main(args: Array<String>){

   var touch = Touch ()
    touch.clicked()

}