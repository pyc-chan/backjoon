import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        int n = scan.nextInt();

        long p = 1;
        for(int i = n; i >= 1; i--){
            p = p*i;
        }
        if(n == 0){
            System.out.print("1");
        }else{
            System.out.print(p);
        }
    }
}
