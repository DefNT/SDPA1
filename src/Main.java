void main(){
    CarDirector director = new CarDirector();

    CarBuilder sportsBuilder = new SportsCarBuilder();
    director.makeStandardCar(sportsBuilder);
    Car sportsCar = sportsBuilder.getResult();
    System.out.println("Output1: " + sportsCar);

    CarBuilder suvBuilder = new SUVCarBuilder();
    director.makeStandardCar(suvBuilder);
    Car suvCar = suvBuilder.getResult();
    System.out.println("Output2: " + suvCar);

    Car customCar = new SportsCarBuilder()
            .reset()
            .buildEngine()
            .buildSeats()
            .getResult();
    System.out.println("CustomOutput: " + customCar);
}