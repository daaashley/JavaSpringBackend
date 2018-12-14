package com.davidashley.DAO;

import com.davidashley.Entity.Student;

import java.util.Collection;

public interface StudentDAO {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
