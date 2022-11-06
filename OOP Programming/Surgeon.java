public class Surgeon extends Doctor {
    protected boolean operating;

    public Surgeon(String name, int num, String speciality, boolean operating) {
        super(name, num, speciality);
        this.operating = operating;
    }

    @Override
    public Stirng toString() {
        return this.name + "" + this.num + "" + this.speciality + ":" + this.operating;
    }

    @Override
    public void work() {
        if (operating) {
            System.out.println(this.name + "works for the hospital." + this.name + "is operating now.");
        } else {
            System.out.println(this.name + "works for the hospital." + this.name + "is not operating now.");
        }

    }
}
