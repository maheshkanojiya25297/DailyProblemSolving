public class CheckPalindrom {
    public static void main(String args[]) {

        String str = "MOM";
        boolean isPalindrome = isPalindromCheck(str);
        System.out.println("is " + "str is palindrom: " + isPalindrome);
    }

    private static boolean isPalindromCheck(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
