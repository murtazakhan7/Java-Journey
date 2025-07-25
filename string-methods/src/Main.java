import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        String email = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter you name: ");
        String name = scanner.nextLine();
        while (!email.contains("@")) {
        System.out.print("enter your mail: ");
        email = scanner.nextLine();
    }
        System.out.print("enter your age: ");
        int age = scanner.nextInt();



        String firstusername = "",secondusername = "";
        firstusername = name.toLowerCase() + rand.nextInt(1,9);
        secondusername = email.substring(0,email.indexOf('@'));

        String domain = email.substring(email.indexOf("@"));

        System.out.println("hello "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Email: "+ email);
        System.out.println("Domain: " + domain);
        System.out.println("First Username: "+  firstusername);
        System.out.println("Second Username: "+ secondusername);

        scanner.close();
      /*  other methods
        .equals
        .startwith
        .touppercase
        .tolowercase
        .substring
        isempty()
        .replace(what,withwthat)
        .length
        .chartAt
        */

    }
}