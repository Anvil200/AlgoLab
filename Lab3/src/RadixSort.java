import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class RadixSort implements Sorting<BigInteger> {
    @Override
    public void sort(List<BigInteger> nums) {
        BigInteger tenPow20 = BigInteger.TEN.pow(20);
        for (BigInteger exp = BigInteger.valueOf(1); exp.compareTo(tenPow20) < 0; exp = exp.multiply(BigInteger.TEN)) {
            sortByBuskets(exp, nums);
        }
    }
    public void sortByBuskets(BigInteger exp, List<BigInteger>nums) {
        ArrayList<ArrayList<BigInteger>> buskets = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            buskets.add(new ArrayList<>());
        }
        for (BigInteger num : nums) {
            // digit = (num / exp) % 10;
            int digit = num.divide(exp).mod(BigInteger.TEN).intValue();

            buskets.get(digit).add(num);
        }
        nums.clear();
        for (ArrayList<BigInteger> busket : buskets) {
            nums.addAll(busket);
        }
    }
}
