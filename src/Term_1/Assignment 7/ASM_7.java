import java.util.*;

/*记得把'ASM_7'替换成Main*/
public class ASM_7 {

    public static Integer toBinary(Integer a){
        return Integer.parseInt(Integer.toString(a, 2));
    }

    public static int[] convertToBinary(int b) {
        char[] a = toBinary(b).toString().toCharArray();
        int[] r = new int[8];
        for (int i = 0;i < a.length;i++) {
            r[i] = Integer.parseInt(a[i] + "");
        }
        return r;
    }

    public static void printBin(int b[]){
        String a = intArrayToString(b);
        print(Integer.parseInt(a));
    }

    public static Integer[] StringToIntArray(String a){
        Integer[] result = new Integer[8];
        for (int i = 0;i < a.toCharArray().length;i++){
            result[i] = Integer.parseInt(a.toCharArray()[i] + "");
        }
        return result;
    }

    public static String intArrayToString(int a[]){
        String result = "";
        for (Integer b:
             a) {
            result += b.toString();
        }
        return result;
    }

    public static int[] addBin(int a[], int b[]){
        Integer c = Integer.parseInt(intArrayToString(a));
        Integer d = Integer.parseInt(intArrayToString(b));
        Integer r = toBinary(c+d);
        int[] result = new int[99];
        for (int i = 0;i < r.toString().toCharArray().length;i++){
            result[i] = Integer.parseInt(r.toString().toCharArray()[i] + "");
        }
        return result;

    }

    public static void print(Integer a){
        int zeroNeeded = 8 - a.toString().length();
        if(zeroNeeded > 0) {
            for (int i = 0; i < zeroNeeded; i++) {
                System.out.print(0 + " ");
            }
            for (char b: a.toString().toCharArray()) {
                System.out.print(b);
                System.out.print(" ");
            }
        } else {
            for (char b: a.toString().substring(-zeroNeeded).toCharArray()) {
                System.out.print(b);
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a base ten number between 0 and 255, inclusive.");
        Integer a = s.nextInt();
        System.out.println("Enter a base ten number between 0 and 255, inclusive.");
        Integer b = s.nextInt();
        System.out.println("First binary number:");
        print(toBinary(a));
        System.out.println("Second binary number:");
        print(toBinary(b));
        System.out.println("Added:");
        Integer add = a + b;
        if (add > 255) {
            System.out.println("Error: overflow");
        }
        print(toBinary(add));



    }
}
