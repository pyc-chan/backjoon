import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            if(str.equals("***")){
                break;
            }
            for(int i = str.length()-1; i >= 0; i--){
                sb.append(str.charAt(i));
            }
            System.out.println(sb.toString());
        }
    }
}