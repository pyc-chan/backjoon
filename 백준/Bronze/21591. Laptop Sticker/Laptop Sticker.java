import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String num = br.readLine();
            br.close();
            String[] nums = num.split(" ");
            int[] ints = new int[4];
            for(int i = 0; i<nums.length; i++){
                ints[i] = Integer.parseInt(nums[i]);
            }
            if(ints[0] >= ints[2]+2 && ints[1]>= ints[3]+2){
                System.out.print(1);
            }else{
                System.out.print(0);
                
            }
            
        } catch (Exception e) {
        }
    }
}