import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] su = new int[6];
        int[] correct = {1,1,2,2,2,8};
        for(int i = 0; i<6; i++){
            su[i] = scan.nextInt();
            System.out.print(correct[i]-su[i]+" ");
        }
        scan.close();
    }
}
