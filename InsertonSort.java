
package inserton.sort;


public class InsertonSort {

    public static void main(String[] args) {
       int[] arr = {1, 10, 21, 10, 3, 5, 12, 21, 4, 0};
       for(int i =1;i<arr.length;i++){
           int unsorted=arr[i];
           int sorted=i-1;
           while(sorted>=0 && unsorted<arr[sorted]){
               arr[sorted+1]=arr[sorted];
               sorted--;
               
           }
           arr[sorted+1]=unsorted;
       }
       for( int a : arr){
           System.out.println(a+",");
       }
    }
    
}
