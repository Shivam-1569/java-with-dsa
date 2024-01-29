/**
 * QuickSort
 */
public class QuickSort {

    public void quickSort(int [] arr, int start, int end){
        if(start<end){
            int p = partition(arr, start, end);
            quickSort(arr, start, p-1);
            quickSort(arr, p+1, end);
        }
    }

    public int partition(int [] arr, int start, int end){
        int pivot = arr[start];
        while(start<end){
            if(arr[pivot] > arr[end]){
                
            }
        }
    }
}