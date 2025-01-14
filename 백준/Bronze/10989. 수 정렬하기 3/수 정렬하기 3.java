import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int num = Integer.parseInt(br.readLine());
            int[] nums = new int[10001];
            for(int i = 0; i< num; i++){
                nums[Integer.parseInt(br.readLine())]++;
            }
            for(int i = 1; i<nums.length; i++){
                for(int j = 0; j < nums[i]; j++){
                    wr.write(String.valueOf(i));
                    wr.newLine();
                }
            }
            wr.flush();
        } catch (Exception e) {
        }
    }
}