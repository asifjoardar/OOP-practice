package schoolManagementSystem;

abstract public class Person {
    private String name;
    private final String gender;

    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    @Override
    public String toString(){
        return "Name = "+this.name+"::Gender = "+this.gender;
    }
    public void updateName(String name){
        this.name = name;
    }
}
