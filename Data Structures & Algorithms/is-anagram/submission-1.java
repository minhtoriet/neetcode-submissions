class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] a = new int[26];
        int[] b = new int[26];
        for(int i = 0; i < s.length(); i++){
            a[(int)s.charAt(i) - 97]++;
            b[(int)t.charAt(i) - 97]++;
        }
        for(int i = 0; i < a.length; i++){
            if (a[i] != b[i]) return false;
        }
        return true;

    }
}