public class Doctor extends HospitalEmployee {

    public Doctor(String name, int num, String speciality) {
        super(name, num, speciality);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void getSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public Str toString() {
        return this.name + "" + this.num + "" + this.Speciality;
    }

    @Override
    public void work() {
        System.out.println(this.name + "works for the hospital." + this.name + " is a " + this.Speciality + " doctor ");
    }

}
