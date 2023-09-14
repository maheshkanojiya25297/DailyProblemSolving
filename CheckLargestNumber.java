public class CheckLargestNumber {
    public static void main(String[] args) {
        int N1 = 2, S1 = 9;
        System.out.println("Input: N = " + N1 + ", S = " + S1);
        System.out.println("Output: " + largestNumber(N1, S1));

        int N2 = 3, S2 = 20;
        System.out.println("Input: N = " + N2 + ", S = " + S2);
        System.out.println("Output: " + largestNumber(N2, S2));

        int N3 = 2, S3 = 10;
        System.out.println("Input: N = " + N3 + ", S = " + S3);
        System.out.println("Output: " + largestNumber(N3, S3));

        int N4 = 1, S4 = 5;
        System.out.println("Input: N = " + N4 + ", S = " + S4);
        System.out.println("Output: " + largestNumber(N4, S4));
    }

    private static String largestNumber(int n1, int s1) {
        if (9 * n1 < s1) {
            return "-1";
        }

        String ans = "";
        for (int i = 0; i < n1; i++) {
            if (s1 >= 9) {
                ans = ans + "9";
                s1 = s1 - 9;
            } else {
                ans = String.valueOf(s1);
                s1 = 0;
            }
        }
        return ans;
    }
}
