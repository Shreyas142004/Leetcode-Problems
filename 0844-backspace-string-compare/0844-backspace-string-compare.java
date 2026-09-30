class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        // if(s.length()!=t.length()){
        //     return false;
        // }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='#'){
                stack1.push(c);
            }else if(!stack1.isEmpty()){
                stack1.pop();
            }
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(c!='#'){
                stack2.push(c);
            }else if(!stack2.isEmpty()) {
                stack2.pop();
            }
        }
        if(stack1.size() != stack2.size()) {
            return false;
        }
        // if(stack1.isEmpty() && stack2.isEmpty()){
        //     return true;
        // }
        // int count=0;
        int size=stack1.size();
        for(int i=0;i<size;i++){
            if(stack1.pop() != stack2.pop()){
                return false;
            }
        }
        return true;
    }
}