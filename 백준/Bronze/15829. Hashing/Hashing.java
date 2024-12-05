import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int result = 0;
            long result2 = 1;
                for(int i = 0; i<num; i++){
                    result2 = 1;
                    for(int j = 0; j<i; j++){
                        result2 = (result2*31)%1234567891;
                    }
                    result = result + (str.charAt(i)-'a'+1)*(int)result2;
            }
            System.out.print(result);
        } catch (Exception e) {
        }
    }
}