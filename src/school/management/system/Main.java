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


    }
}
