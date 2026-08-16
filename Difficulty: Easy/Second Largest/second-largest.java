class Solution {
    public int getSecondLargest(int[] arr) {
       int n=arr.length;
       int max=Integer.MIN_VALUE;
       int sec=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
           if(arr[i]>max){
               sec=max;
               max=arr[i];
           }
           else if(arr[i]>sec&&arr[i]<max){
               sec=arr[i];
           }
          
           
       }
       return (sec==Integer.MIN_VALUE)?-1:sec;
    }
}