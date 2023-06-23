import java.util.Arrays;

public class SortedSquaredArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5, 6, 8, 9};
        int[] val = sortedSquaredArray(array);
        System.out.println(val);
    }

    public static int[] sortedSquaredArray(int[] array) {
        array = Arrays.stream(array).map(e -> e * e).toArray();
        Arrays.sort(array);
        return array;
    }
}
