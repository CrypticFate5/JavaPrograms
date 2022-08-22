package JavaPrograms.SimpleProg;

import java.util.Scanner;

public class samm {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of numbers:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the numbers:");
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int max=arr[0],min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Sum is :"+sum);
        System.out.println("Average is: "+(float)sum/n);
        System.out.println("Maximum is: "+max);
        System.out.println("Minimum is: "+min);
        sc.close();
    }
}
