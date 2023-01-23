class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        int max = 0;
        Set<Character> set = new HashSet();
        while(i<s.length()){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                i++;
                max = Math.max(set.size(),max);
            }
            else{
                set.remove(s.charAt(j));
                j++;
            }
        }
        return max;

    }
}