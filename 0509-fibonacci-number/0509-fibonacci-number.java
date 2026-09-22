class Solution {
    public int fib(int n) {
        int f1=0,f2=1,f3=0;
        if(n==1){
            return f2;
        }
        for(int i=0;i<n-1;i++){
            if(n==0){
                return f1;
            }else if(n==1){
                return f2;
            }else{
                f3=f1+f2;
                f1=f2;
                f2=f3;
            }
        }
        return f3;
    }
}