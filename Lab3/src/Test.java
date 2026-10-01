import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CountingSort sorter = new CountingSort();

        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        sorter.sort(arr);
        System.out.println(arr);
    }
}
