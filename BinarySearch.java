package binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int mid;
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 10, 11, 12, 13, 14, 15, 16};
        int lowid = 0;
        int highid = arr.length - 1;
        int search = 16;
        mid = lowid+highid / 2;
        System.out.println("Runnimg"+arr.length);
        while(lowid<=highid){
        if (arr[mid] == search) {
            System.out.println("element found at" + mid);
            break;
        } else if (search <arr[ mid]) {
            lowid = 0;
            highid = mid - 1;
            mid = lowid + highid / 2;
        } else if (search > arr[mid]) {
            lowid = mid+1;
            highid = arr.length-1;
            mid = lowid + highid / 2;
        }
    
 else{
            System.out.println("Not Found or list Not sorted");
    }

}
}
}