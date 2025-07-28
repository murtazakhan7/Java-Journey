//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Undergraduate ali = new Undergraduate("Ali",23,"BCS",3.7);
        ali.intro();
        ali.studies();

        Graduate sara = new Graduate("Sara",26,"MAI",3.3);
        sara.intro();
        sara.studies();
    }
}