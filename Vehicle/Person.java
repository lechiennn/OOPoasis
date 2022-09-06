package Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    /**
     * constructor.
     *
     * @param name    .
     * @param address .
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.vehicleList = new ArrayList<>();
    }

    /**
     * add v.
     *
     * @param vehicle .
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * remove v.
     *
     * @param registrationNumber .
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle v : vehicleList) {
            if (v.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(v);
                return;
            }
        }
    }

    /**
     * get info.
     *
     * @return .
     */
    public String getVehiclesInfo() {
        if (vehicleList.size() == 0) {
            return name + " has no vehicle!";
        } else {
            String str = name + " has:\n\n";
            for (Vehicle v : vehicleList) {
                str += v.getInfo();
            }
            return str;
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
}
