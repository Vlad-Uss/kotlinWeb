package ru.vladuss.kotlinWeb.Model

import java.io.Serializable
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "students")
data class Student(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    val studentId: Int,

    @Column(name = "student_name")
    @get: NotBlank
    val studentName: String,

    @Column(name = "student_surname")
    @get: NotBlank
    val studentSurname: String,

    @Column(name = "student_age")
    @get: NotBlank
    val studentAge: Int
)