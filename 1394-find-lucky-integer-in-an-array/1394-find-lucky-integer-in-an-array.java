class Solution {
    public int findLucky(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=count.length-1;i>0;i--){
            if(count[i]==i){
                return i;
            }
        }
        return -1;
    }
}