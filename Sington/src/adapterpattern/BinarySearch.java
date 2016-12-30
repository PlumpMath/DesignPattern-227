package adapterpattern;

/**
 * 二分查找法，判断array中是否有key值
 * Created by Heyha on 2016/12/30.
 */
public class BinarySearch {
    public int binarySearch(int array[],int key){
        int low = 0;
        int high = array.length - 1;
        while (low < high){
            int mid = (low + high) / 2;
            int midval = array[mid];
            if (midval > key){
                high = mid - 1;
            }else if (midval < key){
                low = mid + 1;
            }else {
                return 1;
            }
        }
        return -1;
    }
}
