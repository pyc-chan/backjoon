import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        try {
            int num = Integer.parseInt(br.readLine());
            Map<Integer, Integer> nums = new HashMap<>();
            String[] strs = br.readLine().split(" ");
            for (int i = 0; i < num; i++){
                nums.put(Integer.parseInt(strs[i]), 1);
            }
            num = Integer.parseInt(br.readLine());
            String[] strings = br.readLine().split(" ");
            for(int i = 0; i < num; i++){
                Integer number = nums.get(Integer.parseInt(strings[i]));
                if(number != null && number == 1){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }
            bw.write(sb.toString().trim());
            bw.flush();
        } catch (Exception e) {
        }
    }
}