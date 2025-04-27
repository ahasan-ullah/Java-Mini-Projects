package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher rahim=new Teacher(1,"Rahim",5000);
        Teacher karim=new Teacher(2,"Karim",4500);
        Teacher faruk=new Teacher(3,"Faruk",6000);

        List<Teacher> teacherList=new ArrayList<>();
        teacherList.add(rahim);
        teacherList.add(karim);
        teacherList.add(faruk);

        Student monir=new Student(1,"Monir",4);
        Student bashir=new Student(2,"Bashir",12);
        Student hafsa=new Student(3,"Hafsa",8);

        List<Student> studentList=new ArrayList<>();
        studentList.add(monir);
        studentList.add(bashir);
        studentList.add(hafsa);

        School cbbhs=new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        cbbhs.addTeachers(megan);


        monir.paysFees(5000);
        bashir.paysFees(6000);
        System.out.println("CBBHS has earned $"+ cbbhs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        rahim.receiveSalary(rahim.getSalary());
        System.out.println("GHS has spent for salary to " + rahim.getName()
                +" and now has $" + cbbhs.getTotalMoneyEarned());

        karim.receiveSalary(karim.getSalary());
        System.out.println("CBBHS has spent for salary to " + karim.getName()
                +" and now has $" + cbbhs.getTotalMoneyEarned());


        System.out.println(karim);

        faruk.receiveSalary(faruk.getSalary());

        System.out.println(faruk);
    }
}
