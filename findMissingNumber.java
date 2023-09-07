public class findMissingNumber {
    public static void main(String[] args) {
        findMissingNumber missingNumber = new findMissingNumber();
        int[] nums1 = {3, 0, 1};
        int result1 = missingNumber.missingNumber(nums1);
        System.out.println("Missing number: " + result1); // Output: 2
    }

    private int missingNumber(int[] nums1) {
        int n = nums1.length;
        int H = n * (n + 1) / 2;
        System.out.println("H: " + H);
        int i = 0;
        for (int j : nums1) {
            i = i + j;
        }
        System.out.println("i: " +i);
        return H - i;
    }
}

