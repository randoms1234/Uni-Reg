import java.util.Scanner
val input = Scanner(System.`in`)
fun viewRecord() {
    println("Enter an option: ")
    println("Find student by: ")
    println("A: Student ID")
    println("B: Student Name")
    println("C: Course")
    println("D: Module")
    val opt = input.nextLine()
        .ifEmpty { println()
            println()
            println("ERROR:Please enter an option")
            "E" }
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
        "E" ->{
            viewRecord()
        }
        else -> {
            println("Please enter a single character")
            viewRecord()
        }
    }

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
    var studName = input.nextLine()
        .ifEmpty { byStudName() }
        .toString()
        .lowercase()
     studName = getStudName(studName)
        .toString()
    val st = studName.split("),")
        .map { it.trim() }
    println("Sort name by: ")
    println("Default")
    println("A: Ascending")
    println("B: Descending")
    val input = input.nextLine()
        .uppercase()
    when (input) {
        "A" -> {
            st.sorted()
                .forEach { println(it) }
        }
        "B" -> {
            st.sortedDescending()
                .forEach { println(it) }
        }
        else -> {
            st.forEach { println(it) }
        }
    }

    home()


}

fun byStudCourse(){
    println("Please enter the full Course Name: ")
    var studCourse = input.nextLine()
        .ifEmpty { byStudCourse() }
        .toString()
        .lowercase()
    studCourse = getStudCourse(studCourse)
        .toString()
    studCourse.split("),")
        .map { it.trim() }
        .forEach { println(it) }
    home()

}

fun byStudModule(){
    println("Please type in the module: ")
    val studModule = input.nextLine()
        .ifEmpty { byStudModule() }
        .toString()
        .lowercase()
    println(getStudModules(studModule))
    home()

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
    return student.filter { it.studentName.contains(studentName) }
}

fun getStudCourse(studentCourse: String): List<StudentTemplate>{
    return student.filter { it.studentCourse.contains(studentCourse) }
}

fun getStudModules(studentModule: String): List<StudentTemplate>{
    return student.filter { it.studentModules.contains(studentModule) }
}

