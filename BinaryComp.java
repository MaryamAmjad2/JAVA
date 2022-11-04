package binarycomp;

import java.util.Scanner;

public class BinaryComp {

    public static void main(String[] args) {
        int arr[];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size");
        int size = s.nextInt();
        arr = new int[size];
       
        for (int i = 0; i < size; i++) {
            System.out.println("Enter elements in ascending order");
            int inp = s.nextInt();
            arr[i] = inp;
        }
        for (int a : arr) {
            System.out.print(a + ",");
        }
        System.out.println("");
        System.out.println("------");

        System.out.println("Enter Value to search Linear Data");
        int searchLinear = s.nextInt();
        int cl = 0;
        int a = 0;
        for (int i = 0; i < size; i++) {
            cl++;
            if (searchLinear == arr[i]) {

                System.out.println("Data Found");
                a = 1;
            }

        }
        if (a == 0) {
            System.out.println("Not Found");
        }
        System.out.println("Number of Linear comparison = " + cl);

        System.out.println("---------------------");

        //Binary
        int mid = (arr.length / 2) ;
        
        
        System.out.println("mid is "+arr[mid]);

        System.out.println("Enter Value for Binary search");
        int search = s.nextInt();
        if (search ==arr[ mid]) {

            System.out.println("Found at mid");
            System.out.println("Compared Once");
        } else if (search >arr[ mid]) {
            int comp=0;
            for (int i = mid+1; i < size; i++) {
                comp++;
                if (search == arr[i]) {
                    System.out.println("Found at right");

                }
            }
            System.out.println("Number of comparison = " + comp);
        } 
        else if (search < arr[ mid]) {
            int compl=0;
            for (int i = 0; i < mid ; i++) {
                
                compl++;
                if (search == arr[i]) {
                    System.out.println("Found at left");

                }
            }
            System.out.println("Number of Binary comparison = " + compl);
        } else {
            System.out.println("Data Not Found");
        }
   
    }

}
