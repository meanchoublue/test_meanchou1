/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import controllers.StudentController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import models.Student;
import services.StudentService;
import services.StudentServiceImpl;
import utils.FileUtils;

/**
 *
 * @author TruongNhuDat
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StudentController studentController = new StudentController();
        Student student = new Student("Truong Nhu Dat", 22, "Male", (float) 3.0);
        studentController.insertOne(student);        
        studentController.insertOne(student);
        studentController.insertOne(student);
        studentController.insertOne(student);
        List<Student> students = studentController.findAll();
        for(Student s: students){
            System.out.println(s);
        }
    }
}
