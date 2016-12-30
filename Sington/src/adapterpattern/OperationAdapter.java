package adapterpattern;

/**
 * Created by Heyha on 2016/12/30.
 */
public class OperationAdapter implements ScoreOperation {
    private BinarySearch binarySearch;
    private QuickSort quickSort;

    public OperationAdapter() {
        this.binarySearch = new BinarySearch();
        this.quickSort = new QuickSort();
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array,key);
    }
}
