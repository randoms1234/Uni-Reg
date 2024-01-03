fun rStudent() {
    println("Please enter the student ID: ")
    val studID = input.nextLine()
        .ifEmpty { println("ERROR: Please enter a ID")
            rStudent() }
        .toString()
        .lowercase()
    println("Please enter the full name of the student")
    val studName = input.nextLine()
        .ifEmpty { println("ERROR: Entry empty please enter a student name")
            rStudent() }
        .toString()
        .lowercase()

    val student = removeStudent(studName, studID)

    if (student){
        println("Student successfully removed!")
        println("Would you like to remove another student?(Default: No)")
        val opt = input.nextLine()
            .ifEmpty { main() }
            .toString()
            .uppercase()
        if(opt == "Y" || opt == "YES"){
            rStudent()
        }
        else{
            main()
        }
    }
    else{
        println("ERROR: Student not found!")
        println("Please ensure that the student ID and name are correct")
        println("You Entered: ")
        println("Student ID: $studID")
        println("Student Name: $studName")
        rStudent()
    }


}


fun removeStudent(studentName: String, studentID: String): Boolean {
    val a = student.indexOfFirst { it.studentName== studentName}
    val b = student.indexOfFirst { it.studentId == studentID }
    return if(a >= 0 && b >= 0 && a == b){
        student.removeAt(a)
        true
    }
    else{
        false
    }

}
