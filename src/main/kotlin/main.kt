import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    println("Type an Option:")
    println("A: View Student record")
    println("B: Add a Student")
    println("C: Remove a Student")
    println("D: tbc")

    val option = input.next()
        .ifEmpty { "E" }
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
            removeStudent()
        }
        "E" -> {
            println("text field empty")
        }
        else -> {// fake testing info
            init()
        }
    }




}