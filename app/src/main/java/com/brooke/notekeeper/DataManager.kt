package com.brooke.notekeeper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        // Any time an instance of DataManager is created,
        // this code will run and populate courses
        initializeCourses()
    }

    private fun initializeCourses()
    {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_asyncc", title = "Android Asyn Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals; The Core Platform")
        courses.set(course.courseId, course)
    }
}