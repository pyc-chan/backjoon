import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(true){
                boolean result = true;
                String str = br.readLine();
                if(str == "*"){
                    break;
                }
                int[] check = new int[26];

                for(int i = 0; i<str.length(); i++){
                    if(str.charAt(i)== ' '){
                        continue;
                    }
                    check[str.charAt(i)-'a']+=1;
                }
                for(int i = 0; i<check.length; i++){
                    if(check[i]==0){
                        result = false;
                    }
                }
                System.out.println(result ? "Y" : "N");
            }
            br.close();
        } catch (Exception e) {
        }
    }
}
