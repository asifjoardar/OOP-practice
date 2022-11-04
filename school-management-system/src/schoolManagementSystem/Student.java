package schoolManagementSystem;

public class Student extends Person {
    private final int id;
    private final int totalTutionFee;
    private int tutionFeePaid;
    public Student(String name, String gender, int id, int totalTutionFee){
        super(name, gender);
        this.id = id;
        this.totalTutionFee = totalTutionFee;
        this.tutionFeePaid = 0;
    }

    public int getTotalTutionFee() {
        return totalTutionFee;
    }

    public int getTutionFeePaid() {
        return tutionFeePaid;
    }
    public void payFees(int fees){
        tutionFeePaid+=fees;
        School.updateTotalMoneyEarned(fees);
    }
    public int getRemainingFees(){
        return totalTutionFee - tutionFeePaid;
    }
}
