import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String num = br.readLine();
            boolean contain7 = false;
            boolean multiple7 = false;
            if(num.contains("7")){
                contain7 = true;
            }
            if(Integer.parseInt(num)%7==0){
                multiple7 = true;
            }
            System.out.println(contain7 ? (multiple7 ? 3 : 2):(multiple7 ? 1 : 0));
        } catch (Exception e) {
        }
    }
}