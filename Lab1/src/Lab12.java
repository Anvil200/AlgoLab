import java.util.List;

public class Lab12 {
    public int removeElementInplace(List<Integer> arr, int val) {
        int current_index = 0;
        int arr_length = arr.size();

        for (int i = 0; i < arr_length; i++) {
            if (arr.get(i) != val) {
                arr.set(current_index, arr.get(i));
                current_index++;
            }
        }

        return arr.size();
    }
}