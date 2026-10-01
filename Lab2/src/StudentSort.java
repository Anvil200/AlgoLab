import java.util.ArrayList;
import java.util.List;

public class StudentSort implements Sorting<Student> {
    private void slice(List<Student> students, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int middle = (start + end) / 2;

        slice(students, start, middle);
        slice(students, middle, end);

        merge(students, start, middle, end);
    }

    private void merge(List<Student> students, int start, int middle, int end) {
        List<Student> copy = new ArrayList<>(students);

        int i = start;
        int j = middle;

        for (int k = start; k < end; k++) {
            if (i < middle && j < end) {
                if (copy.get(i).compareTo(copy.get(j)) < 0) {
                    students.set(k, copy.get(i++));
                } else {
                    students.set(k, copy.get(j++));
                }
            } else if (i < middle) {
                students.set(k, copy.get(i++));
            } else {
                students.set(k, copy.get(j++));
            }
        }
    }
    @Override
    public void sort(List<Student> students) {
        slice(students, 0, students.size());
    }
}