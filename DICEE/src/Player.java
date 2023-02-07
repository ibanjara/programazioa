public class Player {
    private String izena;
    private Dice dice;
    public static int totalplayers = 0;
    Player(String izena, Dice dice){
        this.izena = izena;
        this.dice = dice;
        totalplayers++;
    }

    public String getIzena(){
        return this.izena;
    }
    public int Try(){
        return dice.play();
    }
    public int getDiceValue(){
        return this.dice.lasttry;
    }
    public void show(){
        System.out.println("Izena: " + this.izena);
        this.dice.show();
    }
    public void showTotalPlayers(){
        System.out.println("Jokalari kopurua: " + totalplayers);
    }
}
