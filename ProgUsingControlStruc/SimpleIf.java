package JavaPrograms.ProgUsingControlStruc;

import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        System.out.println("Program to find if a number is Even");
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&1)==0){
            System.out.println(n+" is an Even number");
        }
        sc.close();
    }
}
