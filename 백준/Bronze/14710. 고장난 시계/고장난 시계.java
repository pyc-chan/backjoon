import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        hour = hour*12%360;
        if(hour == minute){
            System.out.println("O");
        }else{
            System.out.println("X");
        }
        sc.close();
    }
}