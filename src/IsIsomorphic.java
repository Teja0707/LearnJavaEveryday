import java.util.Arrays;

public class IsIsomorphic {

    public static boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length()) {
            return false;
        }
        int[] m1 = new int[256]; // extended ascii
        int[] m2 = new int[256];

        for(int i = 0; i< s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(m1[c1] != m2[c2]) return false;
            m1[c1] = i + 1;
            m2[c2] = i + 1;
            System.out.println("c1 " + c1 + ", c2 " + c2);
            System.out.println("m1 " + Arrays.toString(m1));
            System.out.println("m2 " + Arrays.toString(m2));
        }
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(m1));
        System.out.println(Arrays.toString(m2));
        return true;
    }

    public static void main(String[] args) {
        boolean isomorphic = isIsomorphic("paper", "title");
        System.out.println(isomorphic);
    }
}
