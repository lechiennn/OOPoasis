package Person;

public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructor.
     *
     * @param name    .
     * @param address .
     * @param school  .
     * @param pay     .
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }

    /**
     * override toStr.
     *
     * @return .
     */
    @Override
    public String toString() {
        return String.format("Staff[%s,school=%s,pay=%.1f]",
                super.toString(),
                school,
                pay);
    }
}
