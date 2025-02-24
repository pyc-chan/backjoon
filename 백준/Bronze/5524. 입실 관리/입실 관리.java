import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++){
            String str = br.readLine();
            for (char c : str.toCharArray()) {
                if(c >= 'A' && c <= 'Z'){
                    System.out.print((char)(c+32));
                }
                else{
                    System.out.print(c);
                }
            }
            System.out.println();
        }
        
    }
}