import java.util.Scanner;
class program3 {
    static boolean check(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        String t = s1 + s1;
        if (t.indexOf(s2) != -1) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string ");
        String s1 = sc.next();
        System.out.println("enter second string ");
        String s2 = sc.next();
        if (check(s1, s2))
            System.out.println("Two strings are rotation to each other");
        else
            System.out.println("Two strings are not rotation to each other");
    }
}
