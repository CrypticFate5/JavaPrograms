package JavaPrograms.SimpleProgUsingCmdLine;

public class GreatestOfTwoNos {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        if(a>b){
            System.out.println("The greater value among "+a+" and "+b+" is: "+a);
        }
        else if(b>a){
            System.out.println("The greater value among "+a+" and "+b+" is: "+b);
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
