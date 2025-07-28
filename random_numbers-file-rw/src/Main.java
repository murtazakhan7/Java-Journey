import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers= new int[10];
        try( FileWriter fileWriter = new FileWriter("./numbers.txt");) {

            for(int i =0;i<10;i++) {
                numbers[i] = random.nextInt(1,100);

            }


            for(int num : numbers){

                fileWriter.write(num + "\n");

            }
            System.out.println("numbers written");
        }
        catch (IOException e){
            System.out.println("IO Excception");

        }


        try (BufferedReader reader = new BufferedReader(new FileReader("./numbers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int num = Integer.parseInt(line.trim());
                    System.out.println(num);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }


    }
}