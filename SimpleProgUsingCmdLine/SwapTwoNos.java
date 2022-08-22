package JavaPrograms.SimpleProgUsingCmdLine;

public class SwapTwoNos {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("Before swapping: ");
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping: ");
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);
    }
}
