import java.util.List;
import java.util.ArrayList;


public class TestLab12 {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>(List.of());		
		Lab12 a = new Lab12(); 
		int x = a.removeElementInplace(arr, 99);
		System.out.println(x);
		System.out.println(arr);
	}
}