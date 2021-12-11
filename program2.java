import java.util.Scanner;
public class program2
{
    public static void main(String args[])
    {
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
        for(int i = n-1; i >= 0; i--)
        {
            System.out.print(a[i]+" ");
        }

    }
}
