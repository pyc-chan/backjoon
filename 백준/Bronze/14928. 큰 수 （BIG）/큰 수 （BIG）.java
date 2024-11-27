import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String num = br.readLine();
            int result = 0;
            for(int i = 0; i<num.length(); i++){
                result = (result*10+(num.charAt(i)-'0'))%20000303;
            }
            
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
