class Solution {
    public void rotateArr(int arr[], int d) {
      int n=arr.length;
      d=d%n;
      int k=d;
      int arrr[]=new int[n];
      for(int i=k;i<n;i++){
          arrr[i-k]=arr[i];
      }
      for(int i=0;i<k;i++){
          arrr[n-k+i]=arr[i];
      }
     for(int i=0;i<n;i++){
    arr[i]=arrr[i];
   }
}}