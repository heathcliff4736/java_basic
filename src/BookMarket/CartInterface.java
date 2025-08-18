package BookMarket;

public interface CartInterface {

    void printBookList(Book[] p);
    boolean isCartInBook(String id);
    void insertBook(Book p);
    void removeCare(int numId);
    void deleteBook();

}
