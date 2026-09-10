public class Car {
    private String engine;
    private String transmission;
    private String interior;
    private int seats;

    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public void setInterior(String interior) {
       this.interior = interior;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString(){
        return "Car [" + "Engine='" + engine + '\'' +
                ", Transmission='" + transmission + '\'' +
                ", Interior='" + interior + '\'' +
                ", Seats=" + seats + ']';
    }
}
