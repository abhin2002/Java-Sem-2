import java.util.*;

class HelloWorld {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers\n");
        int a = sc.nextInt();
        int temp = a;
        int sum = 0;
        int rem;
        int b = a;
        int cnt = 0;
        while(b % 10 == 0)
        {
            b = b / 10;
            cnt = cnt + 1;
        }
        while(temp >= 1)
        {
            rem = temp % 10;
            sum = (sum * 10) + rem;
            temp = temp / 10;
        }
        System.out.println("Reverse number = ");
        while(cnt != 0)
        {
            System.out.print("0");
            cnt = cnt - 1;
        }
        System.out.print(sum);
    }
}
