import java.util.ArrayList;
import java.util.List;

public class BookStore implements Cloneable{
    private String storeName;
    private List<Book>bookList = new ArrayList<>();

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void loadData(){

        for(int i = 1;i <= 5;i++){
            Book b = new Book();
            b.setBookId(i);
            b.setBookName("Book "+i);
            getBookList().add(b);
        }
    }
    // shallow clone
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    // deep clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        BookStore store = new BookStore();
        for(Book bk:this.getBookList()){
            store.getBookList().add(bk);
        }
        return store;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "storeName='" + storeName + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
