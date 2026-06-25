class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String a = new String(arr);
            if (!map.containsKey(a)){
                map.put(a,new ArrayList<>());
            } 
            map.get(a).add(s);
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
