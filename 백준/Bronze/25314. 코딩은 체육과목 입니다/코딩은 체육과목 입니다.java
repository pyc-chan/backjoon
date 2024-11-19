import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int su = scan.nextInt();
        
        int n = su/4;
        if(su%4 !=0){
            n = n+1;
        }

        for(int i = 1; i<=n; i++){
            System.out.print("long ");
        }
        System.out.print("int");

        scan.close();
    }
}
