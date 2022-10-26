public class ElectricCar extends ACar {
    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(int batteryCapacity, int maxRange, String registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;

    }

    int getBatteryCapacity() {
        return batteryCapacity;
    }

    int getMaxRange() {
        return maxRange;
    }

    int getWhPrKm() {
        return batteryCapacity * 1000 / maxRange;

    }

    @Override
    public int getRegistrationFee() {
         double kml = (getWhPrKm() / 91.25) / 100;

        if (kml >= 20 && kml <= 50)
            return 330;
        else if (kml >= 15 && kml < 20)
            return 1050;
        else if (kml >= 10 && kml < 15)
            return 2340;
        else if (kml >= 5 && kml < 10)
            return 5500;
        else if (kml < 5)
            return 10470;

        return 0;

    }

    @Override
    public String toString() {
        return super.toString() + ", batterycapacity: " + batteryCapacity + ", maxrange: " + maxRange + ", Wh/Km: " + getWhPrKm() + ", registrationfee: " + getRegistrationFee() + "\n";
    }
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }




}
