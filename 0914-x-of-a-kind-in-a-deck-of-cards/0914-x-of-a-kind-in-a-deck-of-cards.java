class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        // if(deck.length == 1 || deck.length == 0 || deck.length % 2 != 0)
        //     return false;

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : deck) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int gcd = 0;

        for(int n : map.keySet()) {
            gcd = findGCD(gcd, map.get(n));
        }

        return gcd >= 2;
    }

    public int findGCD(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}