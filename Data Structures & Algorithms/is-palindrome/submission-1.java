class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0, j = s.length() -1;
        while (i < j){
            if (Character.compare(s.charAt(i), s.charAt(j)) != 0) return false;
            i++;
            j--;
        }
        return true;
    }
}
