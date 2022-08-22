package JavaPrograms.SimpleProg;

import java.util.Scanner;

class Fact{
    public int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return factorial(n-1)*n;
    }
}
public class factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        Fact ob= new Fact();
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        System.out.println("The factorial of "+n+" is "+ob.factorial(n));
        sc.close();
    }
}
