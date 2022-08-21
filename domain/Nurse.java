package domain;

public class Nurse extends Employee {

    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse in action");
    }

    @Override
    public void performDuties() {
        checkVitals();
        drawBlood();
        cleanPatientArea();
    }

    public void checkVitals(){
        System.out.println("checking the vitals");
    }
    public void drawBlood(){
        System.out.println("5 ml");
    }
    public void cleanPatientArea(){
        System.out.println("Cleaning the patient area");
    }
}
