
import java.util.Random
import java.util.Scanner
//val file = Paths.get("src/main/kotlin/Students.txt")
val student = arrayListOf<StudentTemplate>()
fun addStudent() {
    val input = Scanner(System.`in`)
    val rand = Random()
    var id = ""
    var idCheck = false
    while (!idCheck){
        id = rand.nextInt(10000)
            .toString()
        idCheck = !student.equals(id)
    }
    println("Student ID assigned: $id")
    println("type in Student name")
    val name = input.nextLine()
        .lowercase()
    println("type in Course name")
    val course = input.nextLine()
        .lowercase()
    /*println("type in modules")
    val modules = input.next()*/

    student += StudentTemplate(
        id,
        name,
        course
    )

    println("Student added Successfully: ")
    println(student.filter { it.studentId.contains(id) })
   /* addstu(id)
        .forEach { Files.write(file, student) }*/
    main()

}
/*fun addstu(studentId: String): List<StudentTemplate>{
    return student.filter { it.studentId == studentId }

}*/