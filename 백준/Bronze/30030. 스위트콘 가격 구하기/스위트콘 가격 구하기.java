import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int number = Integer.parseInt(br.readLine());
            System.out.print(number/11*10);
        } catch (Exception e) {
        }
    }
}