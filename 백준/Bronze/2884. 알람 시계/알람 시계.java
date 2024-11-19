import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        b = b-45;
        if(b<0){
            a = a-1;
            b = b+60;
            if(a<0){
                a = a+24;
            }
        }
        System.out.println(a+" "+b);
        
        scan.close();
    }
}
