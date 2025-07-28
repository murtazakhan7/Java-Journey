public class Library {


    Books[] books;
    String section;
    int no_of_books;

    Library(Books[] books,String section,int no_of_books){
        this.books = books;
        this.section=section;
        this.no_of_books = no_of_books;
    }

    void description(){
        System.out.println("Section: " + this.section);
        System.out.println("Total no. of Books: " + this.no_of_books);
        for(Books book:books){
            System.out.println("Book Name: " + book.book_name);
            System.out.println("Author: " + book.author);

        }
    }
}
