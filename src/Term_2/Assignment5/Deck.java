/*
 * AP CS MOOC
 * Term 2 - Assignment 5: Shuffle
 * A class which represents a Deck of cards. For this assignment, you will need to implement the method shuffleDeck, which appears at the bottom of this class.
 */

import java.util.ArrayList;

public class Deck
{
     private ArrayList<Card> deck;


     public Deck ()
     {
          deck = new ArrayList <Card>();
          deck = initDeck();
          deck = shuffleDeck();
          System.out.println(deck);

     }

     public String toString ()
     {
          String temp = "";

          for (Card c: deck)
          {
               temp += c.toString() + "\n";
          }

          return temp;
     }

     public Card getTopCard ()
     {
          Card c = deck.get(0);
          deck.remove(0);


          return c;
     }

     public static ArrayList <Card> initDeck ()
{
     ArrayList <String> ranks = new ArrayList <String> ();

     ranks.add ("Ace");

     ranks.add ("Two");
     ranks.add ("Three");
     ranks.add ("Four");
     ranks.add ("Five");
     ranks.add ("Six");
     ranks.add ("Seven");
     ranks.add ("Eight");
     ranks.add ("Nine");
     ranks.add ("Ten");
     ranks.add ("Jack");
     ranks.add ("Queen");
     ranks.add ("King");

     ArrayList <String> suites = new ArrayList <String> ();
     suites.add("clubs");
     suites.add("diamonds");
     suites.add("hearts");
     suites.add("spades");

     ArrayList <Card> deck = new ArrayList <Card> ();
     for (String s : suites)
     {
          int p = 1;
          for (String r: ranks)
          {
               Card c = new Card (r, s, p);
               p++;
               deck.add(c);
          }
     }
     return deck;
}

     //SHUFFLE ****************************


     public  ArrayList <Card> shuffleDeck ()
     {

          ArrayList <Card> t = this.deck;
          for (int i = 0; i < 1000000; i++) {
               int a = (int) (Math.random() * 52);
               int b = (int) (Math.random() * 52);
               swap(a,b);
          }
          return t;

     }

     public void swap(int a, int b) {
          Card temp = this.deck.get(a);
          this.deck.set(a, this.deck.get(b));
          this.deck.set(b, temp);
     }

     public  ArrayList <Card> getDeck ()
     {

          return this.deck;

     }

}
