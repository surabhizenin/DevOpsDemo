package LeetCode;

import java.util.Stack;

public class test {
    public static void main(String[] args) {
        String s = "}";
        boolean isBalanced = true;
        Stack<Character> myStack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                myStack.push(ch);
            }else{
                if(myStack.isEmpty()){
                    isBalanced = false;
                    break;
                }
                char top = myStack.pop();
                if(ch == ')' && top != '(' || ch == '}' && top != '{' || ch == ']' && top!= '['){
                    isBalanced = false;
                }
            }
            if(!myStack.isEmpty()){
                isBalanced = false;
            }
        }
        System.out.println(isBalanced);

    }
}
