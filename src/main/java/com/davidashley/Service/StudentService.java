package com.davidashley.Service;

import com.davidashley.DAO.StudentDAO;
import com.davidashley.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("mongoData")
    private StudentDAO studentDAO;

    public Collection<Student> getAllStudents(){
        return studentDAO.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.studentDAO.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDAO.removeStudentById(id);
    }
    public void updateStudent(Student student){
        this.studentDAO.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDAO.insertStudent(student);
    }
}
