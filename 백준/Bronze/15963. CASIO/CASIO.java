import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
            
        System.out.println(num1 == num2 ? "1":"0");
        sc.close();
    }
}
