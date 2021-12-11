import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string ");
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            boolean c = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    c = false;
                    break;
                }
            }
            if (c) {
                System.out.println("The first non repeated character :" + s.charAt(i));
                break;
            }
        }
    }
}
