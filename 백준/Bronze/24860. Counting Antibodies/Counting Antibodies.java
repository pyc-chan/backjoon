import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        long d = scan.nextLong();
        long e = scan.nextLong();
        long f = scan.nextLong();
        long g = scan.nextLong();
        long result = ((a*b)+(c*d))*(e*f*g);
        System.out.print(result);

        scan.close();
    }
}
