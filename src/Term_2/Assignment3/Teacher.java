package Term_2.Assignment3;

/**
 * Created by Akatsuki on 2/6/17.
 */
public class Teacher extends Person{
    public String subject;

    public Teacher(String fName, String lName, String Subject) {
        super(fName, lName);
        subject = Subject;
    }

    @Override
    public String toString() {
        return super.toString() + "\n   Subject: " + subject;
    }
}
