import java.util.Scanner

fun ViewRecord() {
    val input = Scanner(System.`in`)
    println("Enter Student Number")
    val StudId = input.next()
        .ifEmpty { "enter a value" }
        .toString()
    student.forEach {  }
}