/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Student;
import utils.FileUtils;

/**
 *
 * @author TruongNhuDat
 */
public class StudentServiceImpl implements StudentService{
    private final String fileName = "C:\\Users\\TruongNhuDat\\Documents\\NetBeansProjects\\JavaApplication1\\src\\javaapplication1\\sv.txt";
    public StudentServiceImpl(){
        
    }

    @Override
    public List<Student> findAll() {
        try {
            return FileUtils.readObjectsFromFile(fileName);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }

    @Override
    public boolean insertStudent(Student student) {
        try {
            List<Student> students = FileUtils.readObjectsFromFile(fileName);
            FileUtils.clear(fileName);
            int id = students.size();
            student.setId(id);
            students.add(student);
            return FileUtils.writeObjectToFile(fileName, students);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean updateStudent(Student student) {
        try {
            List<Student> students = FileUtils.readObjectsFromFile(fileName);
            FileUtils.clear(fileName);
            for(Student s: students){
                if(s.getId() == student.getId()){
                    s.setName(student.getName());
                    s.setAge(student.getAge());
                    s.setSex(student.getSex());
                    s.setGPA(student.getGPA());
                    break;
                }
            }
            return FileUtils.writeObjectToFile(fileName, students);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean deleteStudent(Student student) {
        try {
            List<Student> students = FileUtils.readObjectsFromFile(fileName);
            FileUtils.clear(fileName);
            students.remove(student);
            return FileUtils.writeObjectToFile(fileName, students);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<Student> sortStudent() {
        try {
            List<Student> students = FileUtils.readObjectsFromFile(fileName);
            Collections.sort(students);
            return students;
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public int[] count() {
        int male = 0, female = 0;
        try {
            List<Student> students = FileUtils.readObjectsFromFile(fileName);
            for(Student student: students){
                if(student.getSex().equals("Male")){
                    male += 1;
                }
                else{
                    female += 1;
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(StudentServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new int[]{male, female};
    }
    

    
}
