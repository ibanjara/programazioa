package orders;
import Item.Item;

public class Order {
    private Client client;
    private int orderNumber;
    private Item item;

    Order(Client client, int orderNumber, Item item){
        this.client = client;
        this.orderNumber = orderNumber;
        this.item = item;
    }

    public void show(){
        System.out.println("Client: " + client.getName());
        item.show();
        System.out.println("order number: " + orderNumber);

    }
}
