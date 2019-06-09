package ru.vladuss.kotlinWeb.Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.vladuss.kotlinWeb.Model.Student
import ru.vladuss.kotlinWeb.Service.StudentService


@RestController
@RequestMapping("/api")
class StudentController(
        private val studentService: StudentService){

    @GetMapping("/all")
    fun helloKotlin(): List<Student> {
        return studentService.getAllStudents()
    }

}