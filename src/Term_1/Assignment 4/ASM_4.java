import java.util.Scanner;
//Replace ASM_4 to main
public class ASM_4 {

    public static void main(String[] args) {
        System.out.println("Please enter a tweet:");
        Scanner s = new Scanner(System.in);
        char[] a = s.nextLine().toLowerCase().toCharArray();
        int me = 0;
        int hash = 0;
        boolean r = false;
        if(a.length <= 140) {
            for (int i = 0; i < a.length; i++) {
                if (i != (a.length - 1)) {
                    if (a[i] == '#' && (a[i + 1] != ' ' && a[i + 1] != '\t')) {
                        hash++;
                    }
                    if (a[i] == '@' && (a[i + 1] != ' ' && a[i + 1] != '\t')) {
                        me++;
                    }
                    if (a[i] == 'r' && i < (a.length - 2)) {
                        if (a[i + 1] == 't' && a[i + 2] == ':') {
                            r = true;
                        }
                    }
                }
            }
            System.out.println("Length Correct");
            System.out.println("Number of Mentions: " + me);
            System.out.println("Number of Hashtags: " + hash);
            if(r) {
                System.out.println("The input was a retweet.");
            } else {
                System.out.println("The input was not a retweet.");
            }
        } else {
            System.out.println("Excess Characters: " + (a.length - 140));
        }
    }
}
