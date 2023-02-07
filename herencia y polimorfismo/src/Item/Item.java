package Item;
public abstract class Item {
    private int code;
    private String title;
    private String author;
    protected Item(int code, String title, String author){

        this.code = code;
        this.title = title;
        this.author = author;
    }
    public void show(){
        System.out.println("Code: " + code + "\nTitle: " + title + " \nAutor: " + author);
    }

    public int getCode(){
        return this.code;
    }

    public String getTitle(){
        return this.title;
    }


}

