package Vehicle;

public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * constructor.
     *
     * @param brand              .
     * @param model              .
     * @param registrationNumber .
     * @param owner              .
     * @param hasSidecar         .
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * get info.
     *
     * @return .
     */
    @Override
    public String getInfo() {
        String motoInfo = "Motor Bike:\n";
        motoInfo += "\tBrand: " + this.brand + "\n";
        motoInfo += "\tModel: " + this.model + "\n";
        motoInfo += "\tRegistration Number: " + this.registrationNumber + "\n";
        motoInfo += "\tHas Side Car: " + this.hasSidecar + "\n";
        motoInfo += "\tBelongs to " + this.owner.getName()
                 + " - " + this.owner.getAddress() + "\n";
        return motoInfo;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }
}
