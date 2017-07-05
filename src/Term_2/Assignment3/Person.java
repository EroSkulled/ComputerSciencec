package Term_2.Assignment3;

/**
 * Created by Akatsuki on 2/6/17.
 */
public class Person {
    public String firstName, lastName;
    public Person(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
