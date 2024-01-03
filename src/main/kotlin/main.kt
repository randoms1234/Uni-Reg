import java.util.Scanner
val input = Scanner(System.`in`)
fun main() {
    var loop = true
    while (loop) {
        println("Type an Option:")
        println("A: View Student record")
        println("B: Add a Student")
        println("C: Remove a Student")
        println("E: Exit")

        val option = input.next()
            .ifEmpty { "L" }
            .take(1)
            .uppercase()
        when (option) {
            "A" -> {
                viewRecord()
            }

            "B" -> {
                addStudent()
            }

            "C" -> {
                rStudent()
            }
            "L" -> {
                println("text field empty")
                main()
            }

            "E" -> {
                loop = false
            }

            else -> {// fake testing info
                init()
            }
        }
    }




}