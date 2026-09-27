class Solution {
    public int digitFrequencyScore(int n) {
        // HashSet<Integer> set=new HashSet<>();
        // int num=n;
        // while(num!=0){
        //     int l=num%10;
        //     num.add(l);
        //     num/=10;
        // }
        // int sum=0;
        int score = 0;

        while (n != 0) {
            int digit = n % 10;
            score += digit;
            n = n / 10;
        }

        return score;

    }
}