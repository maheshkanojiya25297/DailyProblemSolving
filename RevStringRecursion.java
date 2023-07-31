import java.util.*;


public class RevStringRecursion {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 5};
        //System.out.println("a: " +Arrays.toString(a));
        int out = a[a.length - 2];
        //System.out.println("sec Largest: " +out);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println(" Reverse: ");
        stringRev(str);
    }

    public static void stringRev(String str) {
        if(str.length()>=1) {
            System.out.println(str.charAt(str.length() - 1));
            stringRev(str.substring(0, str.length() - 1));
        }
    }
}