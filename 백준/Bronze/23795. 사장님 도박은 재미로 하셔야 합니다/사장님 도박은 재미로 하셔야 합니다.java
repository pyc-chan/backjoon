import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;

        int b = 0;
        int c = 0;

        while ((a=scan.nextInt()) != -1) {
            c++;
            if(c==2000){
                break;
            }
            b = b+a;
        }
        
        System.out.print(b);
    }
}
