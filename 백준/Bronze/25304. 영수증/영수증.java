import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt();
        int su = scan.nextInt();

        int tmp = 0;
        for(int i = 1; i<= su; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            tmp = tmp + (a*b);
        }
        if(sum == tmp){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        scan.close();
    }
}
