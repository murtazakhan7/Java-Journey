import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;
        double salary;
        boolean employed;
        String name;
        System.out.print("Enter you age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your salary: ");
        salary = scanner.nextDouble();
        System.out.println("Are you employed (true/false)");
        employed = scanner.nextBoolean();
        System.out.printf("""
                Name: %s
                Age : %d
                Salary: %f
                Employed: %b
                """, name,age,salary,employed);
        scanner.close();
    }

}