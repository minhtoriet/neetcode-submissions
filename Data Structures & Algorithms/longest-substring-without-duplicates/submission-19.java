class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        int l = 0, r = 0, max = 0;
        Map<Character,Integer> map = new HashMap<>();
        while (r<s.length()){
            if (map.containsKey(s.charAt(r)) && map.get(s.charAt(r)) >= l){
                l = map.get(s.charAt(r))+1;
            }
            map.put(s.charAt(r),r);
            max = Math.max(max,r-l + 1);
            r++;
        }
        return max;
    }
}
