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
    val studentId: Long,

    @Column(name = "student_name")
    val studentName: String,

    @Column(name = "student_surname")
    val studentSurname: String,

    @Column(name = "student_age")
    val studentAge: String
)