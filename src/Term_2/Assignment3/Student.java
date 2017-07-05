package Term_2.Assignment3;

/**
 * Created by Akatsuki on 2/6/17.
 */
public class Student extends Person {

    public Integer studentId, level;
    private static Integer num = 0;

    public Student(String fName, String lName, int gLevel) {
        super(fName, lName);
        num++;
        studentId = num;
        if (gLevel <= 12 && gLevel>= 0 ){
            level = gLevel;
        } else {
            level = 0;
        }
    }

    public Integer getLevel() {
        return level;
    }

    public String toString() {
        return super.toString() + "\n   Grade Level: " + level.toString() + "\n   ID: " + studentId.toString();
    }
}
