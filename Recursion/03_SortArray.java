/**
 * 03_SortArray
 */
class SortArray {
    public static void main(String[] args) {
        int[] arr = {5,3,7,4,86,56,9,12};
        sortArray(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sortArray(int[] arr, int n){
        if(n<2){
            return;
        }
        for (int i = 0; i <= n-2; i++) {
            if(arr[n-1] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[n-1];
                arr[n-1] = temp;
            }
        }
        sortArray(arr, n-1);
    }
    
}