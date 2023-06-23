import java.util.*;

public class ValidSubSequence {

    public static void main(String[] args) {

        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = new ArrayList<>(
                Arrays.asList(1, 6, -1, 10));
        boolean val = isValidSubsequence(array, sequence);
        System.out.println(val);
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        Collections.reverse(sequence);
        Stack<Integer> stack = new Stack<>();
        stack.addAll(sequence);

        for (Integer num : array) {
            if (!stack.empty() && Objects.equals(num, stack.peek())) stack.pop();
        }

        return stack.empty();
    }
}
