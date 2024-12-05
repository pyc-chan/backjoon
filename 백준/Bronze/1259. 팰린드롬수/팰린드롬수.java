import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String str = br.readLine();
                if(str.equals("0")){
                    break;
                }else{
                    boolean result = true;
                    for(int i = 0; i<str.length()/2; i++){
                        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                            result = false;
                        }
                    }
                    System.out.println(result ? "yes" : "no");
                }
                
            }
            
        } catch (Exception e) {
        }
    }
}