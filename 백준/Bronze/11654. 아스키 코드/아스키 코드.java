import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String str = scan.nextLine();
        char c = str.charAt(0);

        System.out.println((int)c);

        scan.close();
    }
}
