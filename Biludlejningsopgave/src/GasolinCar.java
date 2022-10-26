public class GasolinCar extends AFuelCar {

    GasolinCar(int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors) {
        super(kmPrLitre, registrationNumber, make, model, numberOfDoors);
    }

    public int getRegistrationFee() {
        int kml = super.getKmPrLitre();

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
    String getFuelType() {
        return "Gasoline";
    }

    @Override
    public String toString() {
        return "GasolinCar{} " + super.toString();
    }


}