import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();

        int[] su = new int[n];

        for(int i = 0; i<n ; i++){
            su[i] = scan.nextInt();
        }
        int v = scan.nextInt();
        int count = 0;
        for(int i = 0; i<n ; i++){
            if(su[i] == v ){
                count++;
            }
        }

        System.out.println(count);
    }
}
