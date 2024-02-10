import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r = 0;
        int n = new Scanner(System.in).nextInt();
        
        while (!isPalindrome(n)) {
            n = palindrome(n);
            r++;
        }

        System.out.print(r);
    }

    static int palindrome(int palindrome) {
        int p = palindrome;
        int result = 0;

        while (p != 0) {
            result = result * 10 + p % 10;
            p /= 10;
        }

        return result + palindrome;
    }

    static boolean isPalindrome(int r) {
        int result = r;
        int ans = 0;

        while (result != 0) {
            ans = ans * 10 + result % 10;
            result /= 10;
        }

        return r == ans;
    }

}
