import java.util.Scanner;

public class ASM_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first String:");
        String a = s.nextLine();
        System.out.println("Enter the replacement String:");
        String b = s.nextLine();
        if (!a.matches("^[a-zA-Z%\\s\\t]*$")) {
            System.out.println("Error: Incorrect characters");
        } else if (a.indexOf("%") == -1) {
            System.out.println("Error: no %");
        } else {
            System.out.println(a.replaceFirst("%", b));
        }
    }
}
