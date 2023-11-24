/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.List;
import models.Student;
import services.StudentService;
import services.StudentServiceImpl;

/**
 *
 * @author TruongNhuDat
 */
public class StudentController {
    private final StudentService studentService;

    public StudentController() {
        this.studentService = new StudentServiceImpl();
    }
    
    public boolean insertOne(Student student){
        return this.studentService.insertStudent(student);
    }
    
    public List<Student> findAll(){
        return this.studentService.findAll();
    }
    
    public boolean updateOne(Student student){
        return this.studentService.updateStudent(student);
    }
    
    public boolean deleteOne(Student student){
        return this.studentService.deleteStudent(student);
    }
}
