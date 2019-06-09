package ru.vladuss.kotlinWeb.Service

import org.springframework.stereotype.Service
import ru.vladuss.kotlinWeb.Model.Student
import ru.vladuss.kotlinWeb.Repository.StudentRepository
import java.util.*

@Service
class StudentService (private val studentRepository: StudentRepository){


    fun getAllStudents(): List<Student> = studentRepository.findAll()

    fun getStudentById(studentId: Long): Optional<Student> = studentRepository.findById(studentId)
}