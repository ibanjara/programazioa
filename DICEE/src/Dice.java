public class Dice {
    public int lasttry = 0;
    public int totalplayed = 0;
    Dice(){
    }
    public void play (){
        totalplayed++;
        lasttry = (int)(Math.random()*6+1);
        return lasttry;
    }
    public void show(){
        System.out.println(lasttry);
    }
}