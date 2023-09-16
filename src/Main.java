public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookStore bs1 = new BookStore();
        bs1.setStoreName("a1");
        bs1.loadData();

        BookStore bs2 = (BookStore) bs1.clone();
        bs1.getBookList().remove(0);
        System.out.println(bs1.getBookList().size());
        System.out.println(bs2.getBookList().size());

    }
}