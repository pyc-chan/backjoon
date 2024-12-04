import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int num = Integer.parseInt(br.readLine());
            for(int i = 0; i<num; i++){
                String str = br.readLine();
                if(str.length() <= 9 && str.length() >= 6){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
            br.close();
        } catch (Exception e) {
        }
    }
}