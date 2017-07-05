package Term_2.Assignment3;

/**
 * Created by Akatsuki on 2/6/17.
 */
public class HighSchoolStudent extends Student {
    public Double gpa;

    public HighSchoolStudent(String fName, String lName, int gLevel, double GPA) {
        super(fName,lName,gLevel);
        if (GPA >= 0 && GPA <= 5) {
            gpa = GPA;
        } else {
            gpa = 0.0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n   GPA: " + gpa;
    }

}
