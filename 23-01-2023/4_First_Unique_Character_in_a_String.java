class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            Character j=s.charAt(i);
            if(!map.containsKey(j)){
                map.put(j,1);
            }
            else{
                map.put(j,map.get(j)+1);
            }
        }
        for(int i=0;i<s.length();i++){
            Character j = s.charAt(i);
            if(map.get(j)==1){
                return i;
            }
        }
        return -1;
    }
}