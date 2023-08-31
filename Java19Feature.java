import java.util.HashMap;

public class Java19Feature {
    public static void main(String[] args) {

        /* Switch Statement */

        int n = 7;
        if (n == 1) {
            System.out.println("print 1");
        } else if (n == 7) {
            System.out.println("print  7");
        }

        switch (n) {
            case 1:
                System.out.println("print 1");
            case 2:
                System.out.println("print 2");
            case 3:
                System.out.println("print 3");
            case 4:
                System.out.println("print 4");
            case 5:
                System.out.println("print 5");
            case 6:
                System.out.println("print 6");
            case 7:
                System.out.println("print 7");
        }
}
}
