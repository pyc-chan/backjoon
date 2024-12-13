import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            
            char[] res = br.readLine().toCharArray();
            br.close();
            sb.append(String.valueOf(res[2]-res[0])).append(" ").append(String.valueOf(res[2]-'0'));
            System.out.print(sb.toString());
        } catch (Exception e) {
        }
        
    }
}