package JavaPrograms.SimpleProg;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        if((n&1)==0){
            System.out.println(n+" is Even");
        }
        else{
            System.out.println(n+" is Odd");
        }
        sc.close();
    }
}
