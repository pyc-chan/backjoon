import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        for(int i = 0; i < 5; i++){
            int tmp = sc.nextInt();
            result = result+tmp*tmp;
        }
        System.out.println(result%10);
        sc.close();
    }
}
