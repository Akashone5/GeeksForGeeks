class Solution {
    public void reverseArray(int arr[]) {
        
        int y=arr.length-1;
        int i=0;
        while(i<y){
            int temp=arr[i];
            arr[i]=arr[y];
            arr[y]=temp;
            y--;
            i++;
        }
    }
}