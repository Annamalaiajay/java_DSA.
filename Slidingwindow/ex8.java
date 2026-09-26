//2461. Maximum Sum of Distinct Subarrays With Length K
import java.util.HashMap;

public class ex8 {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] nums = {11, 1, 1, 2, 3, 4, 5};
        int k = 3;

        long sum = 0;
        long max = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            int x = nums[right];

            // Add current element
            map.put(x, map.getOrDefault(x, 0) + 1);
            sum += x;

            // Window size > k
            if (right - left + 1 > k) {

                int remove = nums[left];

                sum -= remove;

                map.put(remove, map.get(remove) - 1);

                if (map.get(remove) == 0) {
                    map.remove(remove);
                }

                left++;
            }

            // Window size = k AND all elements are distinct
            if (right - left + 1 == k && map.size() == k) {

                max = Math.max(max, sum);
            }
        }

        System.out.println(max);
    }
}