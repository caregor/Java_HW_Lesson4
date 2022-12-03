import java.util.LinkedList;

public class Deck {
    static int deckSize = 10;
    static LinkedList cards = new LinkedList();

    public static void mesh(){
        int count = 0;
        while (count != deckSize) {
            double tmp = Math.random() * 10;
            if (!cards.contains((int) Math.round(tmp))) {
                cards.add((int) Math.round(tmp));
                count++;
            }
        }
    }
    public static int getCard(){
        int card;
        card = (int) cards.getFirst();
        cards.removeFirst();
        return card;
    }
}
