import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            for(int i = 0; i<str.length(); i++){
                if(str.charAt(i)>='a'){
                    System.out.print((char)(str.charAt(i)-32));
                }else{
                    System.out.print((char)(str.charAt(i)+32));
                }
            }
        } catch (Exception e) {
        }
    }
}