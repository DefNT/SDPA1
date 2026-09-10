public interface CarBuilder {
    CarBuilder buildEngine();
    CarBuilder buildTransmission();
    CarBuilder buildInterior();
    CarBuilder buildSeats();
    CarBuilder reset();
    Car getResult();
}
