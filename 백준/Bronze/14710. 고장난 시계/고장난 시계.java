import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] str = br.readLine().split(" ");
            br.close();
            if(Integer.parseInt(str[0])*12%360 == Integer.parseInt(str[1]))
                System.out.print("O");
            else
                System.out.print("X");
        } catch (Exception e) {
        }
    }
}