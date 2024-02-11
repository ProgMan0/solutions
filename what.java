public class Competetive {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int r = 1;

        if (n < 0) {
            n *= -1;
        }

        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                r *= n % 10;
            }
            n /= 10;
        }

        if (r != 1) {
            System.out.println(r);
        } else {
            System.out.println(-1);
        }
    }
}
