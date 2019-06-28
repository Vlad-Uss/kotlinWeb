package ru.vladuss.kotlinWeb.Model

import javax.persistence.*

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