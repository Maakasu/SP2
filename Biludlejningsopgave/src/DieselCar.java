public class DieselCar extends AFuelCar {


    private boolean particleFilter;

    DieselCar(int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors) {
        super(kmPrLitre, registrationNumber, make, model, numberOfDoors);
    }


    boolean hasParticleFilter(){
        return particleFilter;

    }



    @Override
    String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int kml = super.getKmPrLitre();

        if (kml >= 20 && kml <= 50) {
            if (hasParticleFilter())
                return 1130;
            else return 130;

        } else if (kml >= 15 && kml < 20){
            if(hasParticleFilter())
                return 2390;
            else return 1390;

        }
        else if (kml >= 10 && kml < 15)  {
            if(hasParticleFilter())
                return 2850;
            else  return 1850;
        }
        else if (kml >= 5 && kml < 10) {
            if (hasParticleFilter())
                return 3770;
            else return 2770;
        }

        else if (kml < 5) {
            if(hasParticleFilter())
                return 16260;
            else return 15260;
        }
        return 0;

    }
    @Override
    public String toString() {
        return super.toString() +  ", has a particlefilter: " + particleFilter + "\n";
    }
}
