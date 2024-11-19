import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long a = Long.valueOf(scan.next());
        long b = Long.valueOf(scan.next());
        long c = Long.valueOf(scan.next());

        System.out.println(a+b+c);
    }
}
