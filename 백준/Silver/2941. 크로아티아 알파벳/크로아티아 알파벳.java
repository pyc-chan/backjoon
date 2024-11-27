import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
        String str = br.readLine();
        String[] target = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count = 0;
        for(String t : target){
            str = str.replace(t, " ");
        }
        
            System.out.println(count + str.length());

            br.close();
        } catch (Exception e) {

        }
    }
}
