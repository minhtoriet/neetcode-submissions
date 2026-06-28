class Solution {
    public boolean validPalindrome(String s) {
        
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (Character.compare(s.charAt(i),s.charAt(j)) != 0){
                String s1 = s.substring(0,i) + s.substring(i+1);
                String s2 = s.substring(0,j) + s.substring(j+1);
                if (isPalindrome(s1) || isPalindrome(s2)) return true;
                else return false;
            }   
            i++;
            j--;
        }
        return true;
        //sb.deleteCharAt()
    }
    public boolean isPalindrome(String s) {
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