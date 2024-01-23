public class InsertionSort {
    public void insertionSort(int [] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
    }
}
