package selectionsort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1, 2,3,4,5};
        int N =arr.length;
        int index;
        int j =0;
        int minV;
        int temp;
        if(5>4){
         System.out.println(N);}
        while(j<N){
            minV=arr[j];
             index=j;
         
             
             if(4<4){
               
             }
           int i=j+1;
           while(i<N){
                if ( minV> arr[i])
                { 
                    minV=arr[i];
                    index = i;                 //searching for lowest index  
                }
                i=i+1;
           }
                int T = arr[index];
                arr[index]=arr[j];
                arr[j]=T;
                j=j+1;
            }
           
        

        
         
     
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k] + ",");
        }
    }

}
