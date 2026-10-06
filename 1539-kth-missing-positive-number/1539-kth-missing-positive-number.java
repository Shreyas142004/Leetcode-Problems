class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] narr=new int[k+1];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int val=1;
        int index=0;
        while(index<k){
            if(!set.contains(val)){
                narr[index]=val;
                index++;
            }
            val++;
        }
        narr[index]=val;

        int num=narr[k-1];
        return num;
    }
}