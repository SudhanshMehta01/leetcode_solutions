class Solution {
    public int elevatorRequests(int n, int[] arr) {
        
        
        
        int sum = arr[0];
        for(int i=1;i<arr.length;i++){
            
            int d = Math.abs(arr[i]-arr[i-1]);
            sum += d;
        }
        return sum;

        // int sum =0;
        // int stairs = 0;
        // for(int i=0;i<arr.length;i++){
        //     sum += Math.abs(arr[i]-stairs);
        //     stairs = arr[i];
        // }
        // return sum;

        
    }
}