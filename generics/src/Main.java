//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// generics/templates

        shop<String,Integer> item = new shop<>("Shoes",20);
        System.out.println(item.getItem());
        System.out.println(item.getPrice());

        System.out.println(add(2,3));
        System.out.println(add(2.4,3.4));
        System.out.println("3"+"hello");
    }

    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

}