import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            str = str.trim();
            int count = 1;
            if(str.length() == 0){
                count = 0;
            }else{
            for(int i = 0; i<str.length(); i++){
                if(str.charAt(i)==' '){
                    count++;
                }
            }
        }
            System.out.println(count);
            br.close();
        } catch (Exception e) {
            
        }
    }
}
