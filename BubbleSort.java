
package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1,0 ,2,0,10, 2, 3, 5, 12, 21, 4, 0};
        int N =arr.length;
        for(int i =0;i<N-1;i++){
            for(int j=0;j<N-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ",");
        }
    }
    
}
