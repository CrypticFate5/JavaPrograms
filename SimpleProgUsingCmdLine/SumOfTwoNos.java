package JavaPrograms.SimpleProgUsingCmdLine;

public class SumOfTwoNos {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println("The sum of "+a+" and "+b+" is: "+(a+b));
    }
}
