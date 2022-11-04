package schoolManagementSystem;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpend;
    public School(List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpend = 0;
    }
    public List<Teacher> getTeachers(){
        return teachers;
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public void addTeacher(Student student){
        students.add(student);
    }
    public List<Student> getStudents(){
        return students;
    }
    public void addStudents(Student student){
        students.add(student);
    }
    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public static int getTotalMoneySpend() {
        return totalMoneySpend;
    }
    public static void updateTotalMoneySpend(int moneySpend) {
        totalMoneySpend += moneySpend;
        totalMoneyEarned -= moneySpend;
    }
}
