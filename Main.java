import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board.fillBoard();
        Game.fillColours();
        String cityA;
        String cityB;
        String colour;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++){
            System.out.println("Type in city A");
            cityA = sc.next();
            System.out.println("Type in city B");
            cityB = sc.next();
            Game.addTicket(cityA, cityB);
        }
        for (Ticket ticket : Game.chooseTickets()) {
            System.out.println("Im not keeping " + ticket.cityA.name + "-" + ticket.cityB.name);
        }
        for (int i = 0; i < 4; i++){
            System.out.println("Type in the colour of the card for my hand");
            colour = sc.next();
            Game.addCard(colour);
        }
        for (int i = 0; i <= 4; i++){
            System.out.println("Type in the colour of the card for the flop");
            colour = sc.next();
            Game.fillFlop(colour, i);
        }
        //GAME
        int game;
        boolean play = true;
        while (play){
            System.out.println("0.Game finished\n1.Card taken from the flop\n2.Route claimed\n3.My turn\n");
            game = sc.nextInt();
            switch (game){
                case 0 -> play = false;
                case 1 -> {
                    System.out.println("Which card was taken?");
                    int i = sc.nextInt();
                    flopFilling(i);
                }
                case 2 -> routeClaiming(sc);
                case 3 -> System.out.println(Game.move());
            }
        }

    }
    public static void flopFilling(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Current position of the flop " + i);
        System.out.println("Which colour was added?");
        String cr = sc.next();
        Game.fillFlop(cr, i);
    }
    public static void routeClaiming(Scanner sc){
        System.out.println("City A from claimed route: ");
        String ctA = sc.next();
        System.out.println("City B from claimed route: ");
        String ctB = sc.next();
        Game.claimRoute(ctA, ctB,1);
    }
    public static void drawRandom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What colour did I draw?");
        String colour = sc.next();
        Game.addCard(colour);
    }

}