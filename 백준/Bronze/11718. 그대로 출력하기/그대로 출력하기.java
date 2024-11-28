import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            while((str = br.readLine())!=null)
            System.out.println(str);
            br.close();
        } catch (Exception e) {
        }
    }
}