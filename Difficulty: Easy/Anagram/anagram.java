class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()){
            return false;
        }
        char ch[]=s1.toCharArray();
        char ch1[]=s2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
       for(int i=0;i<ch.length;i++){
           if(ch[i]!=ch1[i]){
               return false;
           }}
           return true;
       
    }
}