import java.util.Scanner
val input = Scanner(System.`in`)
fun viewRecord() {
    println("Enter an option: ")
    println("Find student by: ")
    println("A: Student ID")
    println("B: Student Name")
    println("C: Course")
    println("D: Module")
    val opt = input.next()
        .ifEmpty { "E" }
        .take(1)
        .uppercase()

    when (opt) {
        "A" -> {
            byStudId()
        }
        "B" -> {
            byStudName()
        }
        "C" -> {
            byStudCourse()
        }
        "D" -> {
            byStudModule()
        }
        else -> {
            println("Please enter a single character")
            viewRecord()
        }
    }
    //todo format text to be more clear

}


fun byStudId(){
    println("Enter Student Number")
    val studId = input.nextLine()
        .ifEmpty { println("Please enter a valid student ID ")
            byStudId() }
        .toString()

    println(getStudID(studId))
    home()

}


fun byStudName(){
    println("Please enter the students full name: ")
    val studName = input.nextLine()
        .ifEmpty { byStudName() }
        .toString()
        .lowercase()
    println(getStudName(studName))
    home()


}

fun byStudCourse(){
    println("Please enter the full Course Name: ")
    val studCourse = input.nextLine()
        .ifEmpty { byStudCourse() }
        .toString()
        .lowercase()
    println(getStudCourse(studCourse))
    home()

}

fun byStudModule(){

}

fun home(){
    println("Find another student?(Default: No)")
    val opt = input.nextLine()
        .uppercase()
    if (opt == "Y" || opt == "YES"){
        viewRecord()
    }
    else{
        main()
    }
}

fun getStudID(studentId: String): List<StudentTemplate>{
    return student.filter { it.studentId == studentId }
}

fun getStudName(studentName: String): List<StudentTemplate>{
    return student.filter { it.studentName == studentName }
}

fun getStudCourse(studentCourse: String): List<StudentTemplate>{
    return student.filter { it.studentCourse.contains(studentCourse) }
}

