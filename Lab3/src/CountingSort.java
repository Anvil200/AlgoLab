import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountingSort implements Sorting<Integer> {
    @Override
    public void sort(List<Integer> nums) {
        int n = nums.size();

        int[] counter = new int[128];

        for (int i = 0; i < n; i++) {
            counter[nums.get(i)]++;
        }
        int current = 0;
        for (int i = 0; i < n; i++) {
            while (counter[current] == 0) {
                current++;
            }
            nums.set(i, current);
            counter[current]--;
        }
    }
}