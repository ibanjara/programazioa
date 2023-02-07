public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Ivan", new Dice());
        Player player2 = new Player("Aitor", new Dice());
        Player player3 = new Player("Ekaitz", new Dice());
        Player player4 = new Player("Eneko", new Dice());

        int totala1 = 0;
        int totala2 = 0;
        int kont1 = 0;
        int kont2 = 0;

        Player[] players = new Player[4];
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
        players[3] = player4;

        int[] results = new int[4];
        int[] nSixes = new int[4];


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                players[j].Try();
                results[j] += players[j].getDiceValue();
                if(players[j].getDiceValue() == 6){
                    nSixes[j]++;
                }
            }
        }

        int winner=0;
        int mostSixes=0;
        for(int i=1; i<4; i++){
            if (results[i]>results[winner]){
                winner = i;
            }
            if (nSixes[i]>nSixes[mostSixes]){
                mostSixes = i;
            }
        }

        System.out.println("WINNER: " + players[winner].getIzena());
        System.out.println("The player with the most 6s is: " + players[mostSixes]);
    }
}
