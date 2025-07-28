//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Books[] books = new Books[3];
        books[0] = new Books("Zma khukle janaba","ali");

        books[1] = new Books("Zma khukle janaba","mmk");

        books[2] = new Books("Zma khukle janaba","dont know");
        books[2].setBookname("god knows");
        Library library = new Library(books,"Songs",20);

        library.description();

    }
}