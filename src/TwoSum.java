import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        /*
        Technique : 2 pointer method
        1. sort the arrays
        2. 1 pointer to left and 1 pointer to right, compare with target and get result
         */
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int target = 10;
        int[] val = twoNumberSum(array, target);
        System.out.println(Arrays.toString(val));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        int arraySize = array.length;
        if (arraySize < 2) {
            return new int[0];
        }
        // step 1
        Arrays.sort(array);
        // step 2
        int i = 0;
        int j = arraySize - 1;

        while (i < j) {
            if ( array[i] + array[j]  == targetSum ) {
                return new int[]{array[i], array[j]};
            } else if ( array[i] + array[j]  > targetSum ) {
                j--;
            } else {
                i++;
            }
        }
        return new int[0];
    }

}