package ru.vladuss.kotlinWeb.Controller

import javassist.NotFoundException
import org.springframework.web.bind.annotation.*
import ru.vladuss.kotlinWeb.Model.Student
import ru.vladuss.kotlinWeb.Service.StudentService
import java.util.*
import javax.validation.Valid


@RestController
@RequestMapping("/api")
class StudentController(
        private val studentService: StudentService) {

    @GetMapping("/all")
    @ResponseBody
    fun getAll(): List<Student> {
        return studentService.getAllStudents()
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    fun getById(
            @PathVariable id: Long): Optional<Student> {
        return studentService.getStudentById(id)
    }

    @PostMapping("/create")
    @ResponseBody
    fun create(
            @Valid @RequestBody
            student: Student): Student {
        return studentService.createStudent(student)
    }

    @PutMapping("/update/")
    @ResponseBody
    fun update(
            @Valid @RequestBody
            student: Student): Student {

        if (!studentService.getStudentById(student.studentId).isPresent) {
             throw NotFoundException("Student not find with id [${student.studentId}]")
        }

        return studentService.createStudent(student)
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    fun delete(@PathVariable id: Long) {
        studentService.deleteStudent(id)
    }


}