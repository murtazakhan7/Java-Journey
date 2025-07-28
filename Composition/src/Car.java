public class Car {
    String model;
    int year;
    private final Engine engine;

    private static class  Engine{
        String type;

        public Engine(String type) {
            this.type = type;
        }

        void start(){
            System.out.println("Engine type " + this.type + " starting..");
        }
    }
    public Car(String engineType, int year, String model) {
        this.engine = new Engine(engineType);
        this.year = year;
        this.model = model;
    }

    public void car_description(){
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        engine.start();

    }

}
