import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mbti = br.readLine();
        int num = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 0; i < num; i++){
            String str = br.readLine();
            if(str.equals(mbti)){
                result++;
            }
        }
        System.out.println(result);

    }
}