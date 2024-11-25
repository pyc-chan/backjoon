import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        for(int i = 1; i<= a; i++){
            int su1 = scan.nextInt();
            int su2 = scan.nextInt();
            System.out.print("Case #"+i+": "+su1+" + "+su2+" = ");
            System.out.println(su1+su2);
        }

        scan.close();
    }
}
