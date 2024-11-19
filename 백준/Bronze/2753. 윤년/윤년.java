import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b= 0;
        if(a%400 == 0){
            b = 1;
        }else if(a%100 == 0){
            b = 0;
        }else if(a%4 == 0){
            b = 1;
        }
        System.out.println(b);
        scan.close();
    }
}
