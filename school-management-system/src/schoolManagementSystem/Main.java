package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher john = new Teacher("John", "male", 1, 15000);
        Teacher david = new Teacher("David", "male", 2, 20000);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(john);
        teacherList.add(david);
        System.out.println(john.toString());
        System.out.println("Teacher John salary is: "+john.getSalary()+"$");

        Student asif = new Student("Asif", "male", 1, 500000);
        Student joardar = new Student("Joardar", "male", 2, 600000);
        List<Student> studentList = new ArrayList<>();
        studentList.add(asif);
        studentList.add(joardar);
        System.out.println(asif.toString());
        System.out.println("Student Asif's tution fee is: "+asif.getTotalTutionFee()+"$");

        School oxford = new School(teacherList, studentList);
        asif.payFees(300000);
        joardar.payFees(400000);
        john.receiveSalary(john.getSalary());
        System.out.println("School Earned: "+School.getTotalMoneyEarned()+"$");
        System.out.println("School spend: "+School.getTotalMoneySpend()+"$");
    }
}
