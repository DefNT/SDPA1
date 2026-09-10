public class SUVCarBuilder implements CarBuilder{
    private Car car;

    public SUVCarBuilder() {
        this.reset();
    }

    @Override
    public CarBuilder buildEngine() {
        car.setEngine("3.5L V6 Hybrid");
        return this;
    }

    @Override
    public CarBuilder buildTransmission() {
        car.setTransmission("8-Speed Automatic AWD");
        return this;
    }

    @Override
    public CarBuilder buildInterior() {
        car.setInterior("Premium Leather and Wood Trim");
        return this;
    }

    @Override
    public CarBuilder buildSeats() {
        car.setSeats(7);
        return this;
    }

    @Override
    public CarBuilder reset() {
        this.car = new Car();
        return this;
    }

    @Override
    public Car getResult() {
        Car result = this.car;
        this.reset();
        return result;
    }
}
