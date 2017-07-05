import java.util.Scanner;

/*记得把'ASM_1'替换成Main*/
public class ASM_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your test grades.");
        System.out.println("Test 1: ");
        double t1 = s.nextDouble();
        System.out.println("Test 2: ");
        double t2 = s.nextDouble();
        System.out.println("Test 3: ");
        double t3 = s.nextDouble();
        double ta = (t1 + t2 + t3) / 3.0;
        System.out.println("Please enter your quiz grades.");
        System.out.println("Quiz 1: ");
        int q1 = s.nextInt();
        System.out.println("Quiz 2: ");
        int q2 = s.nextInt();
        double qa = (q1 + q2) / 2.0;
        System.out.println("Please enter your homework average.");
        System.out.println("Homework: ");
        double hw = s.nextDouble();
        System.out.println("Test Average: " + ta);
        System.out.println("Quiz Average: " + qa);
        System.out.println("Final Grade: " + ((ta * 0.4) + (qa * 0.35) + hw * 0.25));

    }
}
