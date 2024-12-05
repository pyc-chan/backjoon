import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String str = br.readLine();
                if(Integer.parseInt(str)==0){
                    break;
                }
                boolean result = true;
                int tmp = str.length()/2;
                for(int i = 0; i<tmp; i++){
                    if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                        result = false;
                    }
                }
                System.out.println(result ? "yes" : "no");
            }
        } catch (Exception e) {
        }
    }
}