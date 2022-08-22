package JavaPrograms.SimpleProgUsingCmdLine;

public class DispCmdArgs {
    public static void main(String[] args) {
        System.out.println("The command line arguments are: ");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
