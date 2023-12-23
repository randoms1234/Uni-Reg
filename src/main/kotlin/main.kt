import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    println("Type an Option:")
    println("A: View Student record")
    println("B: Add a Student")
    println("C: Remove a Student")
    println("D: tbc")

    val option = input.next()
        .ifEmpty { "e" }
        .take(1)
        .uppercase()

    if (option == "A"){
        ViewRecord()
    }
    else if(option == "B"){
        AddStudent()
    }
    else if (option == "C"){
        RemoveStudent()
    }




}