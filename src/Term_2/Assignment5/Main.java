import java.util.ArrayList;

/**
 * Created by Akatsuki on 3/24/17.
 */
public class Main {
    public static void main(String[] args){
        Deck v1 = new Deck();
        ArrayList<Card> v2 = new ArrayList<Card>();
        ArrayList<Card> v3 = new ArrayList<Card>();
        Integer v4 = 0;
        Integer v5 = 0;
        for (int i = 0; i < 5; i++) {
            v2.add(v1.getTopCard());
            v3.add(v1.getTopCard());
        }
        for (Card a:
             v2) {
            v4 += a.pointValue();
        }
        System.out.println("Hand 1 (total points " + v4.toString() + ")");
        for (Card a:
                v2) {
            System.out.println(a.toString());
        }
        for (Card a:
                v3) {
            v5 += a.pointValue();
        }
        System.out.println("Hand 2 (total points " + v5.toString() + ")");
        for (Card a:
                v3) {
            System.out.println(a.toString());
        }
        String winStr = v4 < v5 ? "Hand 2 wins!" : "Hand 1 wins!";
        System.out.println(winStr);

    }
}
