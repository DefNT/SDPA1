public class CarDirector {
    public void makeStandardCar(CarBuilder builder) {
        builder.reset()
                .buildEngine()
                .buildTransmission()
                .buildInterior()
                .buildSeats();
    }
}
