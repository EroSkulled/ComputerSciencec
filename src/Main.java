import java.util.Scanner;
import java.util.ArrayList;
//replace the class name main into Main
class Main {
    public class Main {
        private int values [];
        private double average;

        public WhatsIt () {
            values = new int[10];
            findAvg();
        }

        public WhatsIt (int n []) {
            values = n;
            findAvg();
        }

        public void findAvg () {
            double sum = 0;
            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }
            average = 1.0 * sum / values.length;
        }

        public String toString() {
            return "Average: " + average + " Length: " + values.length;
        }
    }
}