import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println(length%5 ==0 ? length/5 : (length/5)+1);


        sc.close();
    }
}
