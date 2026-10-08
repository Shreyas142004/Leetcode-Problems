class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String, Character> reverse = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<words.length;i++){
            char c=pattern.charAt(i);
            String word = words[i];
            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            }
            if (reverse.containsKey(word)) {
                if (reverse.get(word) != c) {
                    return false;
                }
            }
            map.put(c,word);
            reverse.put(word, c);
        }
        return true;
    }
}