class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }
            else mid++;
            }
        }
    }
