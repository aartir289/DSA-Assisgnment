import java.util.Scanner;
import java.util.Stack;
public class program7 {
    static boolean op(char x) {
        switch (x) {
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
    }
    public static String infix(String ex){
        Stack<String> stack = new Stack<>();
        for (int i = ex.length()-1; i >=0 ; i--) {
            char c = ex.charAt(i);
            if(op(c)){
                String s1 = stack.pop();
                String s2 = stack.pop();
                String t = "("+s1+c+s2+")";
                stack.push(t);
            }else{
                stack.push(c+"");
            }
        }
        String inf=stack.pop();

        return inf;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a prefix operator: ");
        String ex = sc.next();
        System.out.println("Infix Expression: " + infix(ex));
    }
}
