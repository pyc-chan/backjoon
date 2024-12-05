import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int num = Integer.parseInt(br.readLine());
            for(int i = 0; i <num; i++){
                String str= br.readLine();
                int result = str.indexOf("D");
                if(result == -1){
                    System.out.println(str.length());
                }else {
                    System.out.println(result);
                }
                    
            }
        } catch (Exception e) {
        }
    }
}