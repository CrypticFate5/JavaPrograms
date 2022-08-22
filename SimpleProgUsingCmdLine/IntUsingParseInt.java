package JavaPrograms.SimpleProgUsingCmdLine;

public class IntUsingParseInt {
    public static void main(String[] args) {
        System.out.println("The integer command line arguments are: ");
        for(int i=0;i<args.length;i++){
            int x=Integer.parseInt(args[i]);
            System.out.println(x);
        }
    }
}
