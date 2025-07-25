import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = scanner.nextLine();
        hello(name);

        System.out.println(sum(2,3,4,4,4,4,4,3,2));

    }

   static public int sum(int a, int b){
        return Math.addExact(a,b);
    }
  static  public int sum(int a, int b,int c){
        return a+b+c;
    }
  static  public int sum(int a, int b,int c,int d){
        return a+b+c+d;
    }

    //using varargs
   static public int sum(int... numbers){
        int value = 0;
        for(int num:numbers){
            value+=num;
        }
        return value;
    }

    static public void hello(String name){
        System.out.println("hello " + name);
    }

}