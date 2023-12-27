fun init(){
    student += StudentTemplate(
        studentId = "123",
        studentName = "connor richardson",
        studentCourse = "comp cci",
        studentModules = listOf("IFP","OOP")
    )
    student += StudentTemplate(
        studentId = "456",
        studentName = "fi",
        studentCourse = "eng",
        studentModules = listOf()
    )
    main()
}