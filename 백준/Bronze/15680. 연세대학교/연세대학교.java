import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        if(a == 0){
            System.out.println("YONSEI");
        }
        if(a == 1){
            System.out.println("Leading the Way to the Future");
        }

        scan.close();
    }
}
