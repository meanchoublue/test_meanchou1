/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import models.Student;

/**
 *
 * @author TruongNhuDat
 */
public class FileUtils {

    public static List<Student> readObjectsFromFile(String fileName) throws IOException, ClassNotFoundException {
        List<Student> students = new ArrayList<>();

        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
                students = (List<Student>) objectIn.readObject();
                return students;
        } catch (FileNotFoundException e) {
            System.err.println("Tệp không tồn tại: " + e.getMessage());
        } catch (EOFException e) {
            System.out.println("Tệp rỗng");
        } catch (IOException | ClassNotFoundException e){
        }
        return students;
    }

    public static boolean writeObjectToFile(String fileName, List<Student> students) throws IOException, ClassNotFoundException {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(students);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    
    public static boolean clear(String fileName) {
        try {
            FileWriter fileWriter;
            fileWriter = new FileWriter(fileName, false);

            fileWriter.write("");
            fileWriter.close();

            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
