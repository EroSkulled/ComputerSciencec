package Term_2.Assignment3;

import java.util.ArrayList;

/**
 * Created by Akatsuki on 2/6/17.
 */
public class School {
    public ArrayList<Student> students;

    public ArrayList<Teacher> teachers;

    public School (ArrayList<Student> Students, ArrayList<Teacher> Teachers) {
        students = Students;
        teachers = Teachers;
    }

    public String getGradeLevel(int level) {
        String r = "";
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getLevel() == level) {
                r += students.get(i).toString() + "\n";
            }
        }
        return r;
    }

    @Override
    public String toString() {
        String r = "Faculty:\n";
        for (int i = 0; i < teachers.size(); i++) {
            r += teachers.get(i).toString();
        }
        r += "\n\nStudent Body:\n";
        for (int i = 0; i < students.size(); i++) {
            r += students.get(i).toString();
        }
        return r;
    }
}