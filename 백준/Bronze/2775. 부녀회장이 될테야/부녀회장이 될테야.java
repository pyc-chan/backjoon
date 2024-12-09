import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i<num; i++){
            int floor = Integer.parseInt(br.readLine());
            int lake = Integer.parseInt(br.readLine());
            int result = 0;
            int[][] sum = new int[floor+1][lake+1];
            for(int j=0; j<=lake; j++){
                sum[0][j] = j;
            }
            for(int j = 1; j<=floor; j++){
                for(int k = 1; k<=lake; k++){
                    sum[j][k]= sum[j-1][k] + sum[j][k-1];
                }
            }
            result = sum[floor][lake];
            System.out.println(result);
        }
    }
}