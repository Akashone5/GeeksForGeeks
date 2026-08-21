class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        char ch[]=s.toCharArray();
        int low=0;
        int res=-1;
        HashMap <Character,Integer> map=new HashMap<>();
        for(int high=0;high<s.length();high++){
            char num=ch[high];
        map.put(num,map.getOrDefault(num,0)+1);
        while(map.size()>k){
            char lch=s.charAt(low);
            map.put(lch,map.get(lch)-1);
            if(map.get(lch)==0){
                map.remove(lch);
            }
            low++;
            
        }
        if(map.size()==k){
            res=Math.max(res,(high-low)+1);
        }}
        return res;
    }
}