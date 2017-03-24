//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        Deck var1 = new Deck();
        ArrayList var2 = new ArrayList();
        ArrayList var3 = new ArrayList();
        Integer var4 = Integer.valueOf(0);
        Integer var5 = Integer.valueOf(0);

        for(int var6 = 0; var6 < 5; ++var6) {
            var2.add(var1.getTopCard());
            var3.add(var1.getTopCard());
        }

        Card var7;
        Iterator var8;
        for(var8 = var2.iterator(); var8.hasNext(); var4 = Integer.valueOf(var4.intValue() + var7.pointValue())) {
            var7 = (Card)var8.next();
        }

        System.out.println("Hand 1 (total points " + var4.toString() + ")");
        var8 = var2.iterator();

        while(var8.hasNext()) {
            var7 = (Card)var8.next();
            System.out.println(var7.toString());
        }

        for(var8 = var3.iterator(); var8.hasNext(); var5 = Integer.valueOf(var5.intValue() + var7.pointValue())) {
            var7 = (Card)var8.next();
        }

        System.out.println("Hand 2 (total points " + var5.toString() + ")");
        var8 = var3.iterator();

        while(var8.hasNext()) {
            var7 = (Card)var8.next();
            System.out.println(var7.toString());
        }

        String var9 = var4.intValue() < var5.intValue()?"Hand 2 wins!":"Hand 1 wins!";
        System.out.println(var9);
    }
}
