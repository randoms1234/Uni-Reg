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

    if (option == "A"){
        viewRecord()
    }
    else if(option == "B"){
        addStudent()
    }
    else if (option == "C"){
        removeStudent()
    }
    else if (option == "E"){
        println("text field empty")
    }
    else{// fake testing info
        init()
    }




}