import java.util.*;

public class Problem6 {
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    result.add(new int[]{i, j});
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};

        List<int[]> zeroSumSubarrays = findZeroSumSubarrays(arr);

        for (int[] subarray : zeroSumSubarrays) {
            System.out.println("(" + subarray[0] + ", " + subarray[1] + ")");
        }
    }
}
