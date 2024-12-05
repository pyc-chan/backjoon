import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(br.readLine());
            String str = br.readLine();
            long result = 0;
            long result2 = 1;
            long mod = 1234567891;
                for(int i = 0; i<num; i++){
                    result = (result + (str.charAt(i)-'a'+1)*result2)%mod;
                    result2 = (result2*31)%mod;
            }
            System.out.print(result);
        } catch (Exception e) {
        }
    }
}