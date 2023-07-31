/*Given an unlimited supply of coins of given denominations, find the total number of distinct ways to get the desired change.
        For example:
        Input: S = { 1, 3, 5, 7 }, target = 8

        The total number of ways is 6

        { 1, 7 }
        { 3, 5 }
        { 1, 1, 3, 3 }
        { 1, 1, 1, 5 }
        { 1, 1, 1, 1, 1, 3 }
        { 1, 1, 1, 1, 1, 1, 1, 1 }


        Input: S = { 1, 2, 3 }, target = 4

        The total number of ways is 4

        { 1, 3 }
        { 2, 2 }
        { 1, 1, 2 }
        { 1, 1, 1, 1 }*/
public class Currency {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7};
        int target = 8;
        for (int i = 0; i < arr.length; i++) {
            if(target%arr[i]==0) {
                for (int j = 0; j < target/arr[i]; j++) {
                    System.out.print(arr[i] + ",");
                }
                System.out.println();
                int sum = 0;
                for (int j = target%arr[i]-1;j>0;j--) {
                    sum=sum+arr[i];
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(target%arr[i]!=0){
                for(int j = 0;j<target/arr[i];j++){
                    System.out.print(arr[i]+",");
                }
                System.out.println();
            }
        }

    }
}
