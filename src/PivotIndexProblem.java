import java.util.Arrays;

public class PivotIndexProblem {

    public static int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int leftSum = 0;
        for (int i=0; i< nums.length; i++){
            if(sum - leftSum - nums[i] == leftSum) return i;
            leftSum = leftSum + nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = pivotIndex(new int[]{ 1, 7, 3, 6, 5, 6});
        System.out.println(result);

        result = pivotIndex(new int[] {-2, 1, -1});
        System.out.println(result);

        result = pivotIndex(new int[] {0, 1, 2, 3, 4});
        System.out.println(result);
    }
}
