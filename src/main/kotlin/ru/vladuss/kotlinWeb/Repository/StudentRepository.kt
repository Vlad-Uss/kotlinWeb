package ru.vladuss.kotlinWeb.Repository

import ru.vladuss.kotlinWeb.Model.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : JpaRepository<Student, Long>