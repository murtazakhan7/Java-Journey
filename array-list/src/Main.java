import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(22);
        arr.set(0,1);
    //    arr.clear();
        arr.removeFirst();
        for(Integer num:arr){
            System.out.println(num);
        }
        System.out.println(arr.size());
    }
}