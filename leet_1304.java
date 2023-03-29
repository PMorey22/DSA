class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        for(int i=1;i<n;i+=2){
            int val=i-(2*i);//-1,-2,-3....-n last 0;
            int val2=i;//1,2,3,4....n;
            arr[i]=val;
            arr[i-1]=val2;
        }
        return arr;
    }
}
