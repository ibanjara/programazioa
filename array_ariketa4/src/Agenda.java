import java.io.IOException;
import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Agenda {
    private HashMap<String, ArrayList<String>> pertsona;
    private int maximoa;

    public Agenda(int maximoa) {
        this.pertsona = new HashMap<>();
        this.maximoa = maximoa;
    }

    public void addEntry(String name, String[] phoneNumbers) {
        if (pertsona.size() == maximoa) {
            System.out.println("Agenda completa");
        }

        if (pertsona.containsKey(name)) {
            System.out.print("Su agenda contiene estos números de teléfono para " + name + ": ");
            for (String phone : pertsona.get(name)) {
                System.out.print(phone + " ");
            }
            System.out.println();
            System.out.print("Quieres reemplazarlos por otros nuevos? (bai/ez) ");
            Scanner sc = new Scanner(System.in);
            if (sc.nextLine().equals("bai")) {
                pertsona.put(name, new ArrayList<>());
                for (String phone : phoneNumbers) {
                    pertsona.get(name).add(phone);
                }
            }
        } else {
            pertsona.put(name, new ArrayList<>());
            for (String phone : phoneNumbers) {
                pertsona.get(name).add(phone);
            }
        }
    }

    public void visualize() {
        for (String name : pertsona.keySet()) {
            System.out.print(name + ": ");
            for (String phone : pertsona.get(name)) {
                System.out.print(phone + " ");
            }
            System.out.println();
        }
    }

    public String searchName(String name) {
        if (!pertsona.containsKey(name)) {
            return name + " ez dago agendan.";
        }
        String result = name + ": ";
        for (String phone : pertsona.get(name)) {
            result += phone + " ";
        }
        return result;
    }

    public int numberOfPhones(String phoneNumber) {
        int kont = 0;
        for (String name : pertsona.keySet()) {
            for (String phone : pertsona.get(name)) {
                if (phone.equals(phoneNumber)) {
                    kont++;
                }
            }
        }
        return kont;
    }
}
