
public class Main{
    public static void main(String[] args) {

        Agenda phoneBook = new Agenda(5);

        phoneBook.addEntry("ivan", new String[]{"12345", "67890"});
        phoneBook.addEntry("iker", new String[]{"11111", "22222"});
        phoneBook.addEntry("iker", new String[]{"33333", "44444"});

        System.out.println(phoneBook.searchName("ivan"));
        System.out.println(phoneBook.searchName("iker"));
        System.out.println(phoneBook.searchName("eneko"));
        System.out.println("Contactos con el numero de telfono 12345: " + phoneBook.numberOfPhones("12345"));
        phoneBook.visualize();
        }
}
