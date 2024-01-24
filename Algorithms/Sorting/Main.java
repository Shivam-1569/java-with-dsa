public class Main {
    public static void main(String[] args) {

        int [] arr = {8,7,6,5,4,1,68,998,766};


        // SelectionSort sort = new SelectionSort();
        // sort.selectionSort(arr);


        // InsertionSort sort = new InsertionSort();
        // sort.insertionSort(arr);

        // BubbleSort sort = new BubbleSort();
        // sort.bubbleSort(arr);

        MergeSort sort = new MergeSort();
        sort.mergeSort(arr, 0, arr.length - 1);


        for (int i : arr) {
            System.out.println(i);
        }
    }
}
