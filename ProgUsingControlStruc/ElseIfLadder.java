package JavaPrograms.ProgUsingControlStruc;

import java.util.Scanner;

public class ElseIfLadder {
    public static void main(String[] args) {
        System.out.println("Enter an integer between 1 to 5");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println("The value is 1");
        }
        else if(n==2){
            System.out.println("The value is 2");
        }
        else if(n==3){
            System.out.println("The value is 3");
        }
        else if(n==4){
            System.out.println("The value is 4");
        }
        else if(n==5){
            System.out.println("The value is 5");
        }
        else{
            System.out.println("Value out of range");
        }
        sc.close();
    }
}
