import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int num = Integer.parseInt(br.readLine());
            int num2=1;
            int i;
            for(i = 1; num2<num; i++){
                num2 = num2+ i*6;
            }
            System.out.print(i);
        } catch (Exception e) {
        }
    }
}