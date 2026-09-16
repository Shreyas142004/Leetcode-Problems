class Solution {
    public int mySqrt(int x) {
        long n;
        long m=x;
        if(x==0){
            return 0;
        }
        while(true){
            n=(m+x/m)/2;
            if(n>=m){
                return(int) m;
            }
            m=n;
        }
    }
}