public class MergeSort {
    public void mergeSort(int[] arr , int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }

    public void merge(int[] arr, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r - mid;
        int [] leftArr = new int[n1];
        int [] rightArr = new int[n2];
        for(int i = 0; i < n1 ; i++){
            leftArr[i] = arr[l+i];
        }
        for(int j =0 ;j<n2; j++){
            rightArr[j] = arr[mid+1+j];
        }
        int i = 0, j = 0, k = l;
        while(i<n1 && j<n2){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                i++;
                k++;
            }
            if(leftArr[i] > rightArr[j]){
                arr[k] = rightArr[i];
            }
        }
        while(i < n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j < n1){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
