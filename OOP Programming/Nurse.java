public class Nurse extends HospitalEmoloyee {
    protected int numofPatients;

    public Nurse(String name, int num, int numofPatients) {
        super(name, num);
        this.numofPatients = numofPatients;
    }

    public int getnumofPatient() {
        return numofPatients;
    }

    public void getnumofPatient(int numofPatients) {
        this.numofPatients = numofPatients;
    }

    @Override
    public String toString() {
        return this.name + "" + this.num + "has" + this.numofPatients + "Patient";
    }

    @Override
    public void work() {
        System.out.println(this.name + "works for the hospital." + this.name + "is a nurse with" + this.numofPatients
                + "patients");
    }
}
