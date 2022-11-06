public class HospitalEmployee {
    protected String name;
    protected int num;

    public HospitalEmoloyee(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNmuber(int num) {
        this.num = num;
    }

    public void work() {
        System.out.println(this.name + "works for the hospital");
    }

    // @Override
    // public String toString() {
    // return this.name + "" + this.num;
    // }

}
