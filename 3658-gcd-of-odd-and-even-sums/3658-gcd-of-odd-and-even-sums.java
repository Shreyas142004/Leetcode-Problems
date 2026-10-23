class Solution {
    public int findGCD(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int[] evenArr=new int[n];
        int[] oddArr=new int[n];
        int eindex=0;
        int oindex=0;
        for(int i=1;i<n*2;i++){
            if(i%2==0){
                evenArr[eindex]=i;
                eindex++;
            }else{
                oddArr[oindex]=i;
                oindex++;
            }
        }
        int esum=0;
        int osum=0;
        for(int i=0;i<n;i++){
            esum+=evenArr[i];
            osum+=oddArr[i];
        }

        int res=findGCD(esum,osum);

        return res;
    }
}