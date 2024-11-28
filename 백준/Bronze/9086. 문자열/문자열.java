import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(br.readLine());
            String str ="";
            for(int i = 0; i<num; i++){
                str = br.readLine();
                System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
            }
        } catch (Exception e) {

        }
    }
}