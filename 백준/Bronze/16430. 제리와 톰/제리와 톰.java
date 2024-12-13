import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        char[] res = str.toCharArray();
        sb.append(String.valueOf(res[2]-res[0])).append(" ").append(String.valueOf(res[2]-'0'));
        System.out.print(sb.toString());
        
    }
}