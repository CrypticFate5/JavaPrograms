package JavaPrograms.Arrays;

import java.util.*;
class rotArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of elements:");
        int a = sc.nextInt(); int [] arr = new int [a];
        System.out.println("Enter the array elements:");
        for(int i = 0;i<a;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter number of times the array is to be rotated:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int j, last;
            last = arr[arr.length-1];
            for(j = arr.length-1; j > 0; j--)
                arr[j] = arr[j-1];
            arr[0] = last; 
        }
        System.out.println("Array after rotation: ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}