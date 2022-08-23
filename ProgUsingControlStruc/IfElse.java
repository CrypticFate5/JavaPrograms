package JavaPrograms.ProgUsingControlStruc;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Enter the age:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>17){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
        sc.close();
    }
}
