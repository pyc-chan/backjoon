import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();

        int[] su = new int[test];

        int min = 1000000;
        int max = -1000000;
        for(int i = 0; i<test; i++){
            su[i] = scan.nextInt();
            if(su[i] > max){
                max = su[i];
            }
            if(su[i]< min){
                min = su[i];
            }
        }
        System.out.println(min +" " + max);

        scan.close();
    }
}
