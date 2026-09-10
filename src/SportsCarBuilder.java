public class SportsCarBuilder implements CarBuilder{
    private Car car;

    public SportsCarBuilder() {
        this.reset();
    }

    @Override
    public CarBuilder buildEngine() {
        car.setEngine("V8 Twin-Turbo");
        return this;
    }

    @Override
    public CarBuilder buildTransmission() {
        car.setTransmission("7-Speed Dual-Clutch");
        return this;
    }

    @Override
    public CarBuilder buildInterior() {
        car.setInterior("Carbon Fiber and Alcantara");
        return this;
    }

    @Override
    public CarBuilder buildSeats() {
        car.setSeats(2);
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
