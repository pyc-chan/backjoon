import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int hour = c/60;
        int min = c%60;

        b = b+min;
        if(b>=60){
            b=b-60; 
            a=a+1;
        }
        a=a+hour;
        if(a>=24){
            a=a-24;
        }

        System.out.println(a+" "+b);
        scan.close();
    }
}
