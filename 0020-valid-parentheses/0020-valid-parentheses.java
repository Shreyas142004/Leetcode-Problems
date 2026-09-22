class Solution {
    public boolean isValid(String s) {
        int c=0;
        if(s.length()%2!=0){
            return false;
        }
        char[] arr=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                if(arr[i]=='}' || arr[i]==')' || arr[i]==']'){
                    return false;
                }
            }
            

            if(arr[i]=='(' || arr[i]=='{' || arr[i]=='[' ){
                stack.push(arr[i]);
            }else if(arr[i]==')' && stack.peek() =='('){
                c++;
                stack.pop();
            }else if(arr[i]=='}' && stack.peek() =='{'){
                c++;
                stack.pop();
            }else if(arr[i]==']' && stack.peek() =='['){
                c++;
                stack.pop();
            }else{
                return false;
            }
        }

        if(c==s.length()/2){
            return true;
        }
        return false;
    }
}