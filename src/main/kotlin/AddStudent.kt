
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
        if (getStudID(id).toString()== "[]"){
            idCheck = true
        }
    }
    println("Student ID assigned: $id")
    println("type in Student name")
    val name = input.nextLine()
        .lowercase()
    println("type in Course name")
    val course = input.nextLine()
        .lowercase()
    println("type in modules")
    println("Separate each module with a comma")
    val modules = input.nextLine()
        .lowercase()
        .split(",")
        .map { it.trim() }
    println("Enter Students marks")
    val marks = input.nextInt()
    student += StudentTemplate(
        id,
        name,
        course,
        modules,
        marks
    )

    println("Student added Successfully: ")
    println(student.filter { it.studentId.contains(id) })
    main()

}