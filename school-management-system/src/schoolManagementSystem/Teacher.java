package schoolManagementSystem;

public class Teacher extends Person {
    private final int id;
    private int salary;
    private int salaryEarned;
    public Teacher(String name, String gender, int id, int salary){
        super(name, gender);
        this.id = id;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpend(salary);
    }
}
