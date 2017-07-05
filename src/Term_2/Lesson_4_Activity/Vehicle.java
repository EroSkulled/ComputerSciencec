
import java.util.ArrayList;
import java.util.Scanner;

public class Vehicle {
    private int location;

    public Vehicle() {
        location = 0;
    }

    public Vehicle(int a) {
        if (a >= -20 && a <= 20) {
            location = a;
        }
    }

    public void forward() {
        if (location != 20) {
            location++;
        }
    }

    public void backward() {
        if (location != -20) {
            location--;
        }
    }

    public int getLocation() {
        return location;
    }

    public String toString() {
        return new String(new char[location + 20]).replace("\0", " ") + "@";
    }
}