package dev.soni.TreeMap;

//Create a TreeMap to store the mappings of student IDs to their details.

import dev.soni.utils.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Q4 {


    public static void main(String[] args) {
        Map<String, Student> studentMap = new TreeMap<>();
        List<Student> students = Student.getStudents();

        students.forEach((student) -> {
            studentMap.put(String.valueOf(student.getId()), student);
        });

        studentMap.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }
}
