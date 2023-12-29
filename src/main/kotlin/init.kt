fun init(){
    student += StudentTemplate(
        studentId = "123",
        studentName = "connor richardson",
        studentCourse = "computer science",
        studentModules = listOf("ifp","oop"),
        studentMarks = 50
    )
    student += StudentTemplate(
        studentId = "456",
        studentName = "fiona",
        studentCourse = "electrical engineering",
        studentModules = listOf("Maths"),
        studentMarks = 60
    )
    student += StudentTemplate(
        studentId="456",
        studentName="emma hernandez",
        studentCourse="software engineering",
        studentModules= listOf("algorithms", "data Structures"),
        studentMarks= 75
    )
    student += StudentTemplate(
        studentId="789",
        studentName="liam jones",
        studentCourse="network engineering",
        studentModules= listOf("routing", "security"),
        studentMarks=88
    )
    student += StudentTemplate(
        studentId="353",
        studentName="alice walker",
        studentCourse="data science",
        studentModules= listOf("statistics", "machine Learning"),
        studentMarks=92
    )
    student += StudentTemplate(
        studentId="789",
        studentName="chloe Miller",
        studentCourse="game Design",
        studentModules= listOf("3d modeling", "game engine programming"),
        studentMarks=85)
    main()
}