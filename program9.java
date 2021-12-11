import java.util.Scanner;
import java.util.Stack;
class program9 {
    static Stack<Character> s = new Stack<>();
    static void insert(char x)
    {
        if(s.isEmpty())
            s.push(x);
        else
        {
            char a = s.peek();
            s.pop();
            insert(x);
            s.push(a);
        }
    }
    static void reverse()
    {
        if(s.size() > 0)
        {
            char st = s.peek();
            s.pop();
            reverse();
            insert(st);
        }
    }
    public static void main(String[] args)
    {
        s.push('1');
        s.push('2');
        s.push('3');
        s.push('4');
        reverse();
        System.out.println(s);
    }
}
