package JavaPrograms.SimpleProg;

import java.util.Scanner;

class GOfThree{
    public int goft(int a,int b,int c) {
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
    }
}
public class GreatestOf3Nos {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 integers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        GOfThree ob=new GOfThree();
        System.out.println("The greatest of "+a+","+b+","+c+" is "+ob.goft(a,b,c));
        sc.close();
    }
}
