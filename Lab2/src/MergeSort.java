import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.min;

public class MergeSort implements Sorting<Integer> {
    private void slice(List<Integer> nums, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int middle = (start + end) / 2;

        slice(nums, start, middle);
        slice(nums, middle, end);

        merge(nums, start, middle, end);
    }

    private void merge(List<Integer> nums, int start, int middle, int end) {
        List<Integer> copy = new ArrayList<>(nums);

        int i = start;
        int j = middle;

        for (int k = start; k < end; k++) {
            if (i < middle && j < end) {
                if (copy.get(i) < copy.get(j)) {
                    nums.set(k, copy.get(i++));
                } else {
                    nums.set(k, copy.get(j++));
                }
            } else if (i < middle) {
                nums.set(k, copy.get(i++));
            } else {
                nums.set(k, copy.get(j++));
            }
        }
    }

    @Override
    public void sort(List<Integer> nums) {
        slice(nums, 0, nums.size());
    }
}
