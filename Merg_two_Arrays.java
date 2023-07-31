/*Merge two arrays by satisfying given constraints
        Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells, merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.
        Input:

        X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
        Y[] = { 1, 8, 9, 10, 15 }

        The vacant cells in X[] is represented by 0

        Output:

        X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }*/
//Solution
public class Merg_two_Arrays {
        public static void main(String[] args) {
            int[] arr ={ 0, 2, 0, 3, 0, 5, 6, 0, 0 };
            int[] arr1={ 1, 8, 9, 10, 15 };
            for(int i=0;i< arr.length;i++){
                for (int j=0;j<arr.length-1;j++)
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                    }
            }
            for(int i=0;i<arr1.length;i++){
                arr[i]=arr1[i];
            }
            for(int i=0;i< arr.length;i++){
                for (int j=0;j<arr.length-1;j++)
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                    }
            }
            for (int a:
                    arr) {
                System.out.print(a+",");
            }
        }
    }
