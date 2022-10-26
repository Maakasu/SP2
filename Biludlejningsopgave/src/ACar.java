abstract class ACar implements Car {
    private String registrationsNumber;
    private String make;
    private String model;
    private int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationsNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }


    @Override
    public String getRegistrationNumber() {
        return null;
    }

    @Override
    public String getMake() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getNumberOfDoors() {
        return 0;
    }


    @Override
    public String toString() {
        return "ACar{" +
                "registrationsNumber='" + registrationsNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }

    public String getRegistrationsNumber() {
        return registrationsNumber;
    }

    public void setRegistrationsNumber(String registrationsNumber) {
        this.registrationsNumber = registrationsNumber;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
