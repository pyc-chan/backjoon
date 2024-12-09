import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        double[] result = new double[num];
        double max = 0;
        double sum = 0;
        for(int i = 0; i < num; i++){
            result[i] = Integer.parseInt(str[i]);
            if(result[i]> max){
                max = result[i];
            }
        }
        for(int i = 0; i < num; i++){
            result[i] = result[i]/max*100;
            sum = sum + result[i];
        }
        System.out.print(sum/num);
        
    }
}