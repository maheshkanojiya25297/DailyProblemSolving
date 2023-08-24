public class PrimeExample {
    public static void main(String args[]) {

        int n = 21, i = 0;
        int m = 0;
        m = n / 2;
        boolean flag = true;

        System.out.println("n: " + n + " m:" + m);

        for(i = 2; i <m; i++) {
            if (n % i == 0) {
                System.out.println("Not prime no because its dicisble by i:" + i);
                flag = false;
            }
        }
        if(flag == true){
            System.out.println("prime no because its not divisible by itself:");
        }
    }
}
