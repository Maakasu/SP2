abstract class AFuelCar extends ACar {
    private final int kmPrLitre;

    AFuelCar(int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }


   abstract String getFuelType();

    public int getKmPrLitre(){

        return kmPrLitre;
    }


    @Override
    public String toString() {
        return "AFuelCar{" +
                "kmPrLitre=" + kmPrLitre +
                "} " + super.toString();
    }
}
