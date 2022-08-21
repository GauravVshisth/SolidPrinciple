package domain;

public class Doctor extends Employee {

    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action");
    }

    @Override
    public void performDuties() {
        diagnose();
        prescribeMedicine();
    }

    private void diagnose(){
        System.out.println("Diagnose the  patient ");
    }
    private void prescribeMedicine(){
        System.out.println("These are the medicines");
    }
}
