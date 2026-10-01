import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentSortTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<Student>();
        int n = scanner.nextInt();

        for  (int i = 0; i < n; i++){
            String name = scanner.next();
            int age = scanner.nextInt();

            Student student = new Student(name, age);
            students.add(student);
        }
        StudentSort sorter = new StudentSort();
        sorter.sort(students);

        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getAge());
        }
     }
}
