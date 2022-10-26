import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class FleetOfCars {

    private ArrayList<Car> fleet = new ArrayList<Car>();

    public FleetOfCars() {

    }

    void addCar(Car car) {
        fleet.add(car);

    }

    AtomicInteger getTotalRegistrationFeeForFleet() {
        AtomicInteger sum = new AtomicInteger();
        fleet.forEach((car) -> {
            sum.addAndGet(car.getRegistrationFee());

        });
        return sum;

    }

    @Override
    public String toString() {
        return "FleetOfCars{" +
                "fleet=" + fleet +
                '}';
    }
}
