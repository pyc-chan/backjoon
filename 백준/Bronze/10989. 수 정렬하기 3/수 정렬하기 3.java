import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        try {
            int num = Integer.parseInt(br.readLine());
            int[] nums = new int[10001];
            for(int i = 0; i< num; i++){
                nums[Integer.parseInt(br.readLine())]++;
            }
            for(int i = 1; i<nums.length; i++){
                if(nums[i]>0)
                for(int j = 0; j < nums[i]; j++){
                    sb.append(i).append("\n");
                }
            }
            wr.write(sb.toString());
            wr.flush();
        } catch (Exception e) {
        }
    }
}