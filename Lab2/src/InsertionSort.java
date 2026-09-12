import java.util.List;

public class InsertionSort implements Sorting<Integer> {
    @Override
    public void sort(List<Integer> nums) {
        if (nums.size() < 2) return;

        for (int i = 1; i < nums.size(); i++) {
            int temp = nums.get(i);
            int j = i - 1;

            while (j >= 0 && temp < nums.get(j)) {
                nums.set(j + 1, nums.get(j));
                j--;
            }
            nums.set(j+1, temp);
        }
    }
}
