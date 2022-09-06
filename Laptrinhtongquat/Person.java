package Laptrinhtongquat;
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    /**
     * constructor.
     */
    public Person() {
    }

    /**
     * Constructor.
     *
     * @param name    .
     * @param age     .
     * @param address .
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * sort person.
     *
     * @param p the object to be compared.
     * @return .
     */
    @Override
    public int compareTo(Person p) {
        if (this.name.equals(p.getName())) {
            return Integer.compare(this.age, p.getAge());
        }
        return this.name.compareTo(p.getName());
    }
}