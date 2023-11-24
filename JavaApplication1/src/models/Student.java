/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;

/**
 *
 * @author TruongNhuDat
 */
public class Student implements Serializable, Comparable<Student>{
    private int id;
    private String name;
    private int age;
    private String sex;
    private float GPA;

    public Student() {
    }
       
    public Student(int id, String name, int age, String sex, float GPA) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.GPA = GPA;
    }
    
    public Student(String name, int age, String sex, float GPA) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", GPA=" + GPA + '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.getGPA() < o.getGPA()){
            return -1;
        }
        else if (this.getGPA() > o.getGPA()){
            return 1;
        }
        else{
            if(this.getId() < o.getId())
                return -1;
            else
                return 1;
        }
    }
}
