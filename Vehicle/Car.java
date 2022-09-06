package Vehicle;

public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * constructor.
     *
     * @param brand              .
     * @param model              .
     * @param registrationNumber .
     * @param owner              .
     * @param numberOfDoors      .
     */
    public Car(String brand, String model,
               String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * get info.
     *
     * @return .
     */
    @Override
    public String getInfo() {
        String carInfo = "Car:\n";
        carInfo += "\tBrand: " + this.brand + "\n";
        carInfo += "\tModel: " + this.model + "\n";
        carInfo += "\tRegistration Number: " + this.registrationNumber + "\n";
        carInfo += "\tNumber of Doors: " + this.numberOfDoors + "\n";
        carInfo += "\tBelongs to " + this.owner.getName()
                + " - " + this.owner.getAddress() + "\n";
        return carInfo;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
