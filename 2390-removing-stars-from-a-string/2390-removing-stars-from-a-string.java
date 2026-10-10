class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='*'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        String str="";
        while(!stack.isEmpty()){
            str=stack.pop()+str;
        }
        return str;
    }
}