import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a>0){
            if(b>0){
                System.out.println(1);
            }if(b<0){
                System.out.println(4);
            }
        }
        if(a<0){
            if(b>0){
            System.out.println(2);
            } if(b<0){
            System.out.println(3);
            }
        }
        scan.close();
    }
}
