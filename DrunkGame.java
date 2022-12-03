public class DrunkGame {
    public static void main(String[] args) {
        int count, p1Card, p2Card;
        Player p1 = new Player();
        Player p2 = new Player();
        p1.name = "Player1";
        p2.name = "Player2";
        Deck.mesh();
        System.out.println(Deck.cards);
        for (int i = 0; i < 5; i++) {
            p1.cards.add(Deck.getCard());
        }
        for (int i = 0; i < 5; i++) {
            p2.cards.add(Deck.getCard());
        }
        System.out.println(p1.cards);
        System.out.println(p2.cards);
        System.out.println();
        count = 0;
        while ((p1.cards.size() > 0) && (p2.cards.size() > 0) ){
            p1Card = (int) p1.cards.getFirst(); 
            p2Card = (int) p2.cards.getFirst();
                if ((p1Card > p2Card) || ((p1Card == 0) && (p2Card == 10))){
                    p1.cards.add(p1Card);
                    p1.cards.removeFirst();
                    p1.cards.add(p2Card);
                    p2.cards.removeFirst();
                }
                else if ((p1Card < p2Card) || ((p1Card == 10) && (p2Card == 0))){
                    p2.cards.add(p2Card);
                    p2.cards.removeFirst();
                    p2.cards.add(p1Card);
                    p1.cards.removeFirst();
                }

            count++;
            if (count == 100){
                System.out.println("!!!BOTVAAA!!!");
                break;
            }
            System.out.println("p1: " + p1.cards);
            System.out.println("p2: " + p2.cards);
        }
        if (p1.cards.size() == 0){
            System.out.println(p2.name + " is WINNER !!!");
        } else {
            System.out.println(p1.name + " is WINNER !!!");
        }
    }
}
