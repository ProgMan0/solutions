// shitcode
public class Square {
    public static void main(String[] args) {
        int n = 2;
        int testResult = 0;

        int result = 0;

        for (int j = 1000; j < n * 1000 + 1; j++) {
            String num = String.valueOf(j);
            for (int i = 0; i < 4; i++) {
                testResult += Integer.parseInt(String.valueOf(num.charAt(i)));
            }
            if (testResult == n) {
                result += 1;
            }
            testResult = 0;
        }
        System.out.println(result);
    }

}
