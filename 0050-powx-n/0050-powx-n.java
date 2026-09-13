class Solution {
    public double myPow(double x, int n) {
        double res=1;
        long digit=n;
        long N=n;
        if(N<0){
            N=-N;
        }
        while(N>0){
            if(N%2==1){
                res=res*x;
            }
            x=x*x;
            N=N/2;
        }
        if(digit<0){
            res=1/res;
        }
        return res;
    }
}