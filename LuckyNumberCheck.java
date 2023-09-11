public class LuckyNumberCheck {
    public static int isLucky(int N) {
        if (N < 1) {
            return 0;
        }

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = i + 1;
        }

        int index = 0;
        int step = 2;

        while (step <= N) {
            int newSize = N - N / step;
            int[] temp = new int[newSize];
            int newIndex = 0;

            for (int i = 0; i < N; i++) {
                if (i % step != 0) {
                    temp[newIndex] = numbers[i];
                    newIndex++;
                }
            }

            numbers = temp;
            N = newSize;
            step++;
        }

        for (int num : numbers) {
            if (num == N) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int N1 = 5;
        int result1 = isLucky(N1);
        System.out.println(result1); // Output: 0

        int N2 = 19;
        int result2 = isLucky(N2);
        System.out.println(result2); // Output: 1
    }
}
