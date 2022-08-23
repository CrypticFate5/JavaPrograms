package JavaPrograms.ProgUsingControlStruc;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+" is the greatest");
            }
            else{
                System.out.println(c+" is the greatest");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is the greatest");
            }
            else{
                System.out.println(c+" is the greatest");
            }
        }
        sc.close();
    }
}
