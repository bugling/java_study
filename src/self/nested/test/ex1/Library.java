package self.nested.test.ex1;

public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int size) {
        Book[] books = new Book[size];
        bookCount = size;
    }

    public void addBook(String title, String auther) {
    }

    public void showBooks() {
    }

    private static class Book {
        private String title;
        private String auther;

        public Book(String title, String auther) {
            this.title = title;
            this.auther = auther;
        }
    }
}
