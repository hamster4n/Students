package lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Hamster4n.
 */
public class StudentUtils {

    private StudentUtils() {

    }

    public static List<Student> findByDepartment(List<Student> students, String department) {
        List<Student> results = new ArrayList<>();
        for (Student student : students) {
            if (Objects.equals(student.getDepartment(), department)) {
                results.add(student);
            }
        }
        return results;
    }

    public static List<Student> findByDepartmentAndCourse(List<Student> students, String department, int course) {
        List<Student> results = new ArrayList<>();
        for (Student student : students) {
            if (Objects.equals(student.getDepartment(), department) && Objects.equals(student.getCourse(), course)) {
                results.add(student);
            }
        }
        return results;
    }

    public static List<Student> findByUnderYear(List<Student> students, long askBirthDate) {
        List<Student> results = new ArrayList<>();
        for (Student student : students) {
            if (student.getBirthDate() >= askBirthDate) {
                results.add(student);
            }
        }
        return results;
    }
}
