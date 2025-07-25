import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // if else and ternary operator

        int age;
        double cost=20.0;
        boolean isStudent,customer;
        System.out.println("Welcome to Pizza Hub");
        System.out.println("Pizza cost: " + cost);

        System.out.print("Do you want to buy a pizza(true/false): ");
        customer = scanner.nextBoolean();

        System.out.print("Are you a Student(true/false): ");
        isStudent = scanner.nextBoolean();

        System.out.print("Please enter your age: ");
        age  = scanner.nextInt();

        if(customer){

            if (age > 18 && isStudent) {

                System.out.println("20% discount for you");
                cost -= (cost * 0.2);
                System.out.println("New price: "+ cost);
            }
            else if(age < 18 ){
                System.out.println("10% discount for you");
                cost -= (cost * 0.1);
                System.out.println("New price: "+ cost);
            }
            else{
                System.out.println("No Discount for you\n Prize $20");
            }


        }


   scanner.close();


    }
}