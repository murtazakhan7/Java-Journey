import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //polymorphism
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Animal[] animals = {dog,cat};
//
//        for(Animal animal:animals){
//            animal.speak();
//        }

        //run time polymorphism
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dog or Cat");
        String choice = scanner.nextLine().toLowerCase().trim();

        scanner.close();

        if(choice.equals("dog")){
            Animal animal = new Dog();
            animal.speak();


        }
        else{
            Animal animal = new Cat();
            animal.speak();
        }

        //compile time polymorphism
//        can be achoeved by overloading methods
//        so in compile time based on paramters of a method, everything is decided
//        it cannot be achoeved through interfaces but through concrete classes




    }
}