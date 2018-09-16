package com.pelmen.Student;

public class Main {
    public static void myCources(Student[]student,String faculty){
        for(int i=0; i<student.length;i++){
            if(faculty==student[i].getFaculty()){
                System.out.println(student[i]);
            }
        }
    }
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0]=new Student("Nikita","Babichev","Ihorevich",16.10,"Horkogo 5b","+380991075308","PE",3,"PZ-123");
        students[1]=new Student("Ivanov","Ivan","Ivanovich",1.02,"Zalupyanka 6","+380991122334","EKAB",1,"KKTE3");

        String myCource = "EKAB";

        myCources(students,"EKAB");
        System.out.println("=========");
        myCources(students,"PE");
    }

}
