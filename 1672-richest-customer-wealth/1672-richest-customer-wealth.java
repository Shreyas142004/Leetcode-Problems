class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxv=0;
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            maxv=Math.max(sum, maxv);
            sum=0;
        }
        return maxv;
    }
}