import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class program8 {
    static boolean check(String ex)
    {
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < ex.length(); i++)
        {
            char x = ex.charAt(i);
            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char c;
            switch (x) {
                case ')':
                    c = stack.pop();
                    if (c == '{' || c == '[')
                        return false;
                    break;
                case '}':
                    c = stack.pop();
                    if (c == '(' || c == '[')
                        return false;
                    break;
                case ']':
                    c = stack.pop();
                    if (c == '(' || c == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a expression ");
        String ex = sc.next();
        if (check(ex))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
