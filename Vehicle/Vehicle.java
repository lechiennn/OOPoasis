package Vehicle;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Constructor.
     *
     * @param brand              .
     * @param model              .
     * @param registrationNumber .
     * @param owner              .
     */
    public Vehicle(String brand, String model,
                   String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * abstract method.
     *
     * @return .
     */
    public abstract String getInfo();

    /**
     * a.
     *
     * @param newOwner .
     */
    public void transferOwnership(Person newOwner) {
        this.owner = newOwner;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Person getOwner() {
        return owner;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
