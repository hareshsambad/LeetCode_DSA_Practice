
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome pn = new Palindrome();
        boolean palNum = pn.isPalindrome();
        System.out.println(palNum);
    }

    public boolean  isPalindrome()
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n = Math.abs(num);

        String ans = "";
        int temp;

        while (n != 0) {
            temp = n % 10;
            n = n / 10;
            ans += Integer.toString(temp);
            System.out.println(ans);
        }

        n = Integer.parseInt(ans);
        if (num == n) {
            return true;
        }

        else {
            return false;
        }
    }
}
