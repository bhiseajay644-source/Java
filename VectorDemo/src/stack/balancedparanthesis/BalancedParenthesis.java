package stack.balancedparanthesis;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter the input : ");
        String str=scan.next();

        Stack<Character>stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        StringBuilder reversed=new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        String reverse=reversed.toString();
        if(str.equals(reverse)){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }
}
