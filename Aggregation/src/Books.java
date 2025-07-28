public class Books{
    String book_name;
    String author;

    Books(String book_name,String author){
        this.book_name = book_name;
        this.author = author;
    }
    void setBookname(String name){
        this.book_name = name;
    }

    void display(){
        System.out.println("Book Name: " + this.book_name);
        System.out.println("Author Name: " + this.author);
    }
}