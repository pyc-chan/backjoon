import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            String line;
            int a = Integer.parseInt(br.readLine().trim());

            StringTokenizer str;
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= a; i++) {
                str = new StringTokenizer(br.readLine()," ");
                sb.append(Integer.parseInt(str.nextToken())+Integer.parseInt(str.nextToken())).append("\n");
            }

            System.out.println(sb);
        } catch (Exception e) {

        }

    }
}
