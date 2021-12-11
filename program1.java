import java.util.Scanner;

public class program1 {
    public static void check(int a[], int sum)
    {
        System.out.println("Pairs are:");
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if ((a[i] + a[j]) == sum)
                    System.out.printf("(%d,%d)\n", a[i],a[j]);
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("length of array: ");
        n = sc.nextInt();
        int a[] = new int[n+1];
        System.out.println("enter elements ");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the value of sum ");
        int sum = sc.nextInt();
        check(a, sum);
    }
}
