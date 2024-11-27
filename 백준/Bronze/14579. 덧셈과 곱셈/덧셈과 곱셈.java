import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = 1;
        for(int i = num1; i<=num2; i++){
            result = (result*(i*(i+1)/2))%14579;
        }
        System.out.println(result);
        sc.close();
    }
}
