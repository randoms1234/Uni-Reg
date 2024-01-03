var sort = 0
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
    println("Please enter part of a name for multiple entries or a full name for one entry ")
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
    val temp = ""
    println("Please enter the full Course Name: ")
    var studCourse = input.nextLine()
        .ifEmpty { byStudCourse() }
        .toString()
        .lowercase()
    println("Filter by: ")
    println("A: Default")
    println("B: Name")
    println("C: Module")
    var usrInput = input.nextLine()
        .ifEmpty { "A" }
        .toString()
        .uppercase()
    when (usrInput){
        "A" -> {
            studCourse = getStudCourse(studCourse, usrInput, temp)
                .toString()
             studCourse.split("),")
                .map { it.trim() }
                .forEach { println(it) }

        }
        "B" ->{
            sort = 1
            println("Enter Name to filter by: ")
            usrInput = input.nextLine()
                .ifEmpty { println("Input Empty")
                ""}
                .toString()
                .lowercase()
            studCourse = getStudCourse(studCourse,usrInput, temp)
                .toString()
            studCourse.split("),")
                .map { it.trim() }
                .forEach { println(it) }
            sort = 0
        }
        "C" -> {
            sort = 2
            println("Enter the name of the module to filter by: ")
               val studentModule = input.nextLine()
                .ifEmpty {
                    println("Input Empty")
                    ""
                }
                .toString()
                .lowercase()
            studCourse = getStudCourse(studCourse,usrInput, studentModule)
                .toString()
            studCourse.split("),")
                .map { it.trim() }
                .forEach { println(it) }
            sort = 0
        }
    }
    home()

}

fun byStudModule(){
    println("Please type in the module: ")
    val studModule = input.nextLine()
        .ifEmpty { byStudModule() }
        .toString()
        .lowercase()
    getStudModules(studModule)
        .toString()
        .split("),")
        .map { it.trim() }
        .forEach { println(it) }

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

fun getStudCourse(studentCourse: String, studentName: String, studentModule: String): List<StudentTemplate>{
    return when (sort) {
        1 -> {
            student.filter { it.studentCourse.contains(studentCourse) }
                .filter { it.studentName.contains(studentName) }
        }
        2 -> {
            student.filter { it.studentCourse.contains(studentCourse) }
                .filter { it.studentModules.contains(studentModule) }
        }
        else -> {
            student.filter { it.studentCourse.contains(studentCourse)}
        }
    }

}

fun getStudModules(studentModule: String): List<StudentTemplate>{
    return student.filter { it.studentModules.contains(studentModule) }
}

