public class Main {
    public static void main(String[] args) {

        ElectricCar eCar = new ElectricCar(  460,  463, " Fisse "," Porsche ", " Taycan ", 5 );

        GasolinCar gCar = new GasolinCar( 8," TopG ", " Lamborghini ", " Urus ",  5 );

        DieselCar dCar = new DieselCar( 8, " Kongen ", " Audi ", " SQ8 ",  5);


        FleetOfCars myFleet = new FleetOfCars();

        myFleet.addCar(eCar);
        myFleet.addCar(gCar);
        myFleet.addCar(dCar);

        System.out.println(myFleet);
        System.out.println(myFleet.getTotalRegistrationFeeForFleet());
    }
}