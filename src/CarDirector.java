public class CarDirector {
    public void makeStandartCar(CarBuilder builder) {
        builder.reset()
                .buildEngine()
                .buildTransmission()
                .buildInterior()
                .buildSeats();
    }
}
