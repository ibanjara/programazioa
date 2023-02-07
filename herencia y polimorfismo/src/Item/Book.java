package Item;

public class Book extends Item {
    int numPages;

    public Book(int code, String title, String author, int numPages) {
        super(code, title, author);
        this.numPages = numPages;
    }

    public void show() {
        super.show();
        System.out.println("Number of pages: " + numPages);
    }

    public void fullCode() {
        System.out.println("Liburuaren kodigoa: " + getCode());
        System.out.println("Liburuaren titulua: " + getTitle());
        System.out.println("Orrialde kopurua: " + numPages);
    }
}
