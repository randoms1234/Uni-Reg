
import java.nio.file.Files
import java.nio.file.Paths
import java.util.Scanner
val file = Paths.get("src/main/kotlin/Students.txt")
val student = arrayListOf<StudentTemplate>()
fun AddStudent() {
    val input = Scanner(System.`in`)
    println("Type in Student id")
    val id = input.nextLine()
    println("type in Student name")
    val name = input.nextLine()
    println("type in Course name")
    val course = input.nextLine()
    /*println("type in modules")
    val modules = input.next()*/

    student += StudentTemplate(
        id,
        name,
        course
    )

    println("Student added Successfully: ")
    println(student)
   /* addstu(id)
        .forEach { Files.write(file, student) }*/
    main()

}
/*fun addstu(studentId: String): List<StudentTemplate>{
    return student.filter { it.studentId == studentId }

}*/