package Arrays.Leetcode;
import java.util.Arrays;
public class Leetcode_414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for(int i = nums.length - 1; i > 0; i--) {
            if(nums[i] != nums[i - 1]) {
                count++;
            }
            if(count == 3) {
                return nums[i - 1];
            }
        }
        return nums[nums.length - 1];
    }
    public static void main(String[] args) {
        Leetcode_414 solver = new Leetcode_414();
        int[] testArray = {2, 2, 3, 1};
        int result = solver.thirdMax(testArray);
        System.out.println("The third distinct maximum is: " + result);
    }

}
