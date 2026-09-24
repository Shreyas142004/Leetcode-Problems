class Solution {
    public int firstMissingPositive(int[] nums) {
        // int n=1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==n){
        //         n++;
        //     }
        // }
        // return n;
        HashSet<Integer> set=new HashSet<>();
        int n=1;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            set.add(val);
        }

        for(int i=0;i<set.size();i++){
            if(set.contains(n)){
                n++;
            }
        }
        return n;
    }
}