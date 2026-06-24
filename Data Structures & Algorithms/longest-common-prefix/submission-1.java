class Solution {
    public static String longestCommonPrefix(String[] strs) {        
        if (strs.length == 1) return strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == "") return "";
        }
        String longestPrefix = "";
        boolean valid = true;
        for (int i = 0; i < strs[0].length(); i++){
            if (!valid) break;
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++){
                if (strs[j].length() <= i || c != strs[j].charAt(i)) {
                    valid = false;
                    break;
                }
                if (j == strs.length - 1) longestPrefix = longestPrefix.concat((String.valueOf(c)));
            }
        }
        return longestPrefix;
    }
    
}