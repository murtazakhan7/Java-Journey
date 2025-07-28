
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("predator",2);

        Dog dog = new Dog("Dog",4,"tommy");
        dog.description();
        Cat cat  = new Cat("Cat",4,"Tommy",7);
        cat.description();

        Animal newdog = new Dog("predator",4,"tommy");
        newdog.description();


    }
}