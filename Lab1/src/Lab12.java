import java.util.ArrayList;
import java.util.List;

public class Lab12 {
    public int removeElementInplace(List<Integer> arr, int val) {
        List<Integer> arr_new = new ArrayList<Integer>();
        arr_new.addAll(arr);

        for (int i = 0; i < arr_new.size(); i++) {
            if (arr_new.get(i) == val) {
                arr_new.remove(i);
                i--;
            }
        }
        return arr_new.size();
    }
}

