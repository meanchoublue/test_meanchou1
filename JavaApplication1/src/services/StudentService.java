/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.List;
import models.Student;

/**
 *
 * @author TruongNhuDat
 */
public interface StudentService {
    
    public List<Student> findAll();
    public boolean insertStudent(Student student);
    public boolean updateStudent(Student student);
    public boolean deleteStudent(Student student);
    public List<Student> sortStudent();
    public int[] count();
}
