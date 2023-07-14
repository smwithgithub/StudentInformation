package com.codewithsmshamim;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Student> arrayList = new ArrayList<Student>();
        Student student = new Student();
        Scanner sc= new Scanner(System.in);

        System.out.print("How many students Information you want to insert:- ");
        int count= sc.nextInt();
        sc.nextLine();

        for(int i = 1; i<=count;i++){

            System.out.println("\nFill-up the "+i +" no student information form");

            System.out.print("\nEnter the Student name: - ");
            student.setName(sc.nextLine());

            System.out.print("\nEnter the Student department: - ");
            student.setDept(sc.nextLine());

            System.out.print("\nEnter the Student section: - ");
            student.setSection(sc.nextLine());

            System.out.print("\nEnter the Student id: - ");
            student.setId(sc.nextInt());
            sc.nextLine();

            arrayList.add(new Student(student.getName(), student.getDept(), student.getSection(), student.getId()));

            System.out.println(i+" "+arrayList.toString());

        }

        System.out.print("Enter student name to query:- ");
        String checkName= sc.nextLine();

        for (Student studentInfo: arrayList) {
            if(studentInfo.getName().contains(checkName)){
                System.out.println(studentInfo.toString());
            }
        }

    }
}
