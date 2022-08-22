package JavaPrograms.SimpleProg;

import java.util.Scanner;

public class Fibo {
    public int fibo(int n) {
        if(n==1||n==2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of terms to produce fibonacci series: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Fibo ob=new Fibo();
        System.out.println("The fibonacci series: ");
        for(int i=1;i<=n;i++){
            System.out.print(ob.fibo(i)+" ");
        }
        sc.close();
    }
}
