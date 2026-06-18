import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}
public class StudentFilterMap {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Amit", 85));
        students.add(new Student(2, "Priya", 65));
        students.add(new Student(3, "Rahul", 90));
        students.add(new Student(4, "Sneha", 70));

        // marks greater than 75
        List<Student> filteredStudents = students.stream()
                .filter(s -> s.marks > 75)
                .collect(Collectors.toList());
        System.out.println("Students with marks greater than 75:");
        filteredStudents.forEach(s -> System.out.println(s.rollNo + " " + s.name + " " + s.marks));

        // Map student names
        List<String> studentNames = students.stream().map(s -> s.name).collect(Collectors.toList());

        System.out.println("\nStudent Names:");
        studentNames.forEach(System.out::println);
    }
}
