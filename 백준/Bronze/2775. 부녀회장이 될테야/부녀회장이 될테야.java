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
            int[][] sum = new int[floor+1][lake+1];
            for(int j = 0; j<=floor; j++){
                for(int k = 1; k<=lake; k++){
                    if(j==0){
                        sum[j][k] = k;
                    }else{
                        sum[j][k]= sum[j-1][k] + sum[j][k-1];
                    }
                }
            }
            System.out.println(sum[floor][lake]);
        }
    }
}