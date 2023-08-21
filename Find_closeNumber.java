public class Find_closeNumber {
    public static void main(String[] args) {
        int N = 13;
        int M = 4;

        int modular = N / M;
        int low = M * modular;
        int upp = M * (modular + 1);

        if (Math.abs(N - low) <= Math.abs(N - upp)) {
            System.out.println(low);
        } else {
            System.out.println(upp);
        }


    }
}
