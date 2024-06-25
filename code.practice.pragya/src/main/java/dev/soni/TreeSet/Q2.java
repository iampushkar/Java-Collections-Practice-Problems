package dev.soni.TreeSet;

//Create a TreeSet of custom objects and implement the Comparable interface for sorting.

import dev.soni.utils.Student;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Q2 {

    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet<>((s1,s2) -> s1.getBatch().compareTo(s2.getBatch()));
        studentSet.add(new Student(1, "Soni", "A"));
        studentSet.add(new Student(2, "Pragya", "B"));
        studentSet.add(new Student(3, "James", "C"));
        studentSet.add(new Student(4, "Mary", "D"));
        studentSet.add(new Student(5, "Monica", "A"));
        studentSet.add(new Student(6, "Mary", "B"));

        studentSet.forEach(System.out::println);
    }

}
