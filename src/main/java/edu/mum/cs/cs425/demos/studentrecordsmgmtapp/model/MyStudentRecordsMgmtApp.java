package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MyStudentRecordsMgmtApp {
    public static void main(String[] args) {
        Student s1 = new Student("110001","Dave", LocalDate.of(1951,11,18));
        Student s2 = new Student("110002","Anna", LocalDate.of(1990,12,07));
        Student s3 = new Student("110003","Erica", LocalDate.of(1974,01,31));

        Student[] list = new Student[]{s1,s2,s3};

        System.out.println(getListOfPlatinumAlumniStudents(list));
        printHelloWorld(new int[]{5,15,14,35,70});
        System.out.println(findSecondBiggest(new int[]{19,9,11,0,12}));

    }
    public static List<Student> getListOfPlatinumAlumniStudents(Student[] list){
        List<Student> aluminy = new ArrayList<>();
        for (Student st: list
             ) {
            if(LocalDate.now().getYear() - st.getDateOfAdmission().getYear() > 30){
                aluminy.add(st);
            }
        }
        return aluminy;
    }
    public static void printHelloWorld(int[] integers){
        for(int num: integers){
            if(num%5==0 && num%7==0){
                System.out.println("HelloWorld \n");
            } else if(num%7==0){
                System.out.println("World \n");
            } else if(num%5==0){
                System.out.println("Hello \n");
            }
        }
    }
    public static int findSecondBiggest(int[] integers){
        Arrays.sort(integers);
        return integers[integers.length-2];
    }

}
