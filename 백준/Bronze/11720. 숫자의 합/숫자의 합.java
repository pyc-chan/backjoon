import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();

        char[] su = str.toCharArray();
        int sum = 0;
        for(int i = 0; i<n ; i++){
            sum = sum + su[i] - 48;
        }
        System.out.println(sum);

        scan.close();
    }
}
