package Item;

public class Record extends Item {
    private String discography;

    Record(int code, String title, String author, String discography) {
        super(code, title, author);
        this.discography = discography;
    }

    public void show() {
        super.show();
        System.out.println("Discography: " + discography);
    }
}
