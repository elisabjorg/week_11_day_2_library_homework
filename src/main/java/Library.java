import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public int countBooks() {
        return this.books.size();
    }

    public boolean capacityForBooks(){
        if(this.capacity >= countBooks()){
            return true;
        }
        return false;
    }




}
