package dev.soni.utils;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Student {
    int id;
    String name;
    String Batch;

    public Student(int id, String name, String Batch) {
        this.id = id;
        this.name = name;
        this.Batch = Batch;
    }

    public static List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Soni", "A"));
        students.add(new Student(2, "Pragya", "B"));
        students.add(new Student(3, "Tapan", "C"));
        students.add(new Student(4, "Riday", "D"));
        students.add(new Student(5, "Amar", "E"));
        return students;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Batch='" + Batch + '\'' +
                '}';
    }
}
