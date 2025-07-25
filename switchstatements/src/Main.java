import javax.swing.plaf.synth.SynthTextAreaUI;
import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Scanner;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = "";
        LocalDate date = LocalDate.now();

        // Get day of week as "Monday", "Tuesday", etc.
        day = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();


        System.out.println("Check whether its a weekday or weekend:(y/n) ");
        String check = scanner.nextLine().toLowerCase();

        if (check.equals("y")) {
            switch (day) {
                case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> System.out.println("Weekday");
                case "SATURDAY", "SUNDAY" -> System.out.println("Weekend");
            }
        } else {
            System.out.println("Another time maybe");
        }
    }
}