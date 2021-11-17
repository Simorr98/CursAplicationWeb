package com.company.Collections;

import java.util.Stack;

public class Parenthesis {
    public static boolean validateParenthesis(String expression){
        Stack<Character> stack = new Stack();
        for (int i = 0; i < expression.length(); i++){
            if (expression.charAt(i) == '('){
                stack.push('(');
            }
            if (expression.charAt(i) == ')'){
                if (stack.isEmpty()){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
