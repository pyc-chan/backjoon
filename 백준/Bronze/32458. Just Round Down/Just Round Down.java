import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            double str = Double.parseDouble(br.readLine());
            System.out.println((int)str);
        } catch (Exception e) {
        }
    }
}