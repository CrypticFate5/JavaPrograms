package JavaPrograms.ProgUsingControlStruc;

import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        System.out.println("Enter 1-while 2-dowhile: ");
        Scanner ob=new Scanner(System.in);
        int ch=ob.nextInt(),i=1;
        ob.close();
        if(ch==1){
            while(i<3){
                System.out.println(i);
                i++;
            }
        }
        else{
            do{
                System.out.println(i);
                i++;
            }while(i<1);
        }
    }
}