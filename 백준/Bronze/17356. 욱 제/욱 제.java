import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] wookjea = new int[2];
        for(int i = 0; i < wookjea.length; i++){
            wookjea[i] = Integer.parseInt(input[i]);
        }
        double m = (wookjea[1] - wookjea[0])/400.0;

        double result = 1 / (1 + Math.pow(10, m));
        System.out.println(result);
    }
}