public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        if(s.isBlank()) return true;
        int i = 0;
        int j = 0;
        while (i < t.length()) {
            if ( j < s.length() && t.charAt(i) == s.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == s.length();
    }

    public static void main(String[] args) {
        boolean subsequence = isSubsequence("b", "abc");
        System.out.println(subsequence);
    }


}
