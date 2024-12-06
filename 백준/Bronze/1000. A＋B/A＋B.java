import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] str = br.readLine().split(" ");
            System.out.print(Integer.parseInt(str[0])+Integer.parseInt(str[1]));
            br.close();
        } catch (Exception e) {
        }
    }
}