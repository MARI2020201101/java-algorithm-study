package ch06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortHeight {

    static class Student{
        int height;
        String name;

        public String getName() {
            return name;
        }

        public int getHeight() {
            return height;
        }

        public Student(int height, String name) {
            this.height = height;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
          new Student(180,"김길동"),
          new Student(175,"홍길동"),
          new Student(130,"강길동"),
          new Student(167,"송길동"),
          new Student(156,"이길동"),
          new Student(210,"박길동"),
        };

        Arrays.sort(students, (s1, s2)-> s1.getHeight()-s2.getHeight());
        for (Student student : students) {
            System.out.printf("[이름]:%s [키]:%d \n" , student.getName(),student.getHeight());
        }
        System.out.println("---------------------");

        Arrays.sort(students, (s1,s2)-> s1.getName().compareTo(s2.getName()));
        for (Student student : students) {
            System.out.printf("[이름]:%s [키]:%d \n" , student.getName(),student.getHeight());
        }
    }
}
