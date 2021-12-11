import java.util.Scanner;
import java.util.Stack;
public class program6 {
     static boolean op(char x){
        switch (x){
            case '-':
            case '+':
            case '/':
            case '*':
            case '^':
                return true;
        }
        return false;
    }
    public static String prefix(String ex){
        Stack<String> stack = new Stack<>();
        for (int i = 0; i <ex.length() ; i++) {
            char c = ex.charAt(i);
            if(op(c)){
                String s1 = stack.pop();
                String s2 = stack.pop();
                String t = c + s2 + s1;
                stack.push(t);
            }else{
                stack.push(c+"");
            }
        }
        String post = stack.pop();
        return post;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a postfix operator: ");
        String ex = sc.next();
        System.out.println("prefix Expression: " + prefix(ex));
    }
}
