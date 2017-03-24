//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;

public class Deck {
     private ArrayList<Card> deck = new ArrayList();

     public Deck() {
          this.deck = initDeck();
          this.deck = this.shuffleDeck();
          System.out.println(this.deck);
     }

     public String toString() {
          String var1 = "";

          Card var3;
          for(Iterator var2 = this.deck.iterator(); var2.hasNext(); var1 = var1 + var3.toString() + "\n") {
               var3 = (Card)var2.next();
          }

          return var1;
     }

     public Card getTopCard() {
          Card var1 = (Card)this.deck.get(0);
          this.deck.remove(0);
          return var1;
     }

     public static ArrayList<Card> initDeck() {
          ArrayList var0 = new ArrayList();
          var0.add("Ace");
          var0.add("Two");
          var0.add("Three");
          var0.add("Four");
          var0.add("Five");
          var0.add("Six");
          var0.add("Seven");
          var0.add("Eight");
          var0.add("Nine");
          var0.add("Ten");
          var0.add("Jack");
          var0.add("Queen");
          var0.add("King");
          ArrayList var1 = new ArrayList();
          var1.add("clubs");
          var1.add("diamonds");
          var1.add("hearts");
          var1.add("spades");
          ArrayList var2 = new ArrayList();
          Iterator var3 = var1.iterator();

          while(var3.hasNext()) {
               String var4 = (String)var3.next();
               int var5 = 1;
               Iterator var6 = var0.iterator();

               while(var6.hasNext()) {
                    String var7 = (String)var6.next();
                    Card var8 = new Card(var7, var4, var5);
                    ++var5;
                    var2.add(var8);
               }
          }

          return var2;
     }

     public ArrayList<Card> shuffleDeck() {
          ArrayList var1 = this.deck;

          for(int var2 = 0; var2 < 1000000; ++var2) {
               int var3 = (int)(Math.random() * 52.0D);
               int var4 = (int)(Math.random() * 52.0D);
               this.swap(var3, var4);
          }

          return var1;
     }

     public void swap(int var1, int var2) {
          Card var3 = (Card)this.deck.get(var1);
          this.deck.set(var1, this.deck.get(var2));
          this.deck.set(var2, var3);
     }

     public ArrayList<Card> getDeck() {
          return this.deck;
     }
}
