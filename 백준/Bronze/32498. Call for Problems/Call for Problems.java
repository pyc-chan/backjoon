import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 0; i < num; i++){
            int input = Integer.parseInt(br.readLine());
            if(input%2 != 0){
                result++;
            }
        }
        System.out.println(result);
    }
}