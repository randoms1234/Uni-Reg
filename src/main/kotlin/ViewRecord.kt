import java.util.Scanner

fun ViewRecord() {
    val input = Scanner(System.`in`)
    println("Enter Student Number")
    val StudId = input.next()
        .ifEmpty { "enter a value" }
        .toString()


    println(getStudInfo(StudId))
    //todo format text to be more clear
    main()

}

fun getStudInfo(studentId: String): List<StudentTemplate>{
    return student.filter { it.studentId == studentId }
}