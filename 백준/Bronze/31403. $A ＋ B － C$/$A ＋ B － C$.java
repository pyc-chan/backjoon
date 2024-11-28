import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String ab = a+""+b;
        int intab = Integer.parseInt(ab);
        System.out.println(a+b-c);
        System.out.println(intab-c);


        sc.close();
    }
}