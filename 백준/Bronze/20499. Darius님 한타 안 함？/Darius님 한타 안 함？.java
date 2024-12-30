import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] strs = br.readLine().split("/");
            int[] numbers = new int[strs.length];
            for(int i = 0; i< strs.length; i++){
                numbers[i] = Integer.parseInt(strs[i]);
            }
            if(numbers[1]>numbers[0]+numbers[2]||numbers[1]==0){
                System.out.println("hasu");
            }else{
                System.out.println("gosu");
            }
        } catch (Exception e) {
        }
    }
}