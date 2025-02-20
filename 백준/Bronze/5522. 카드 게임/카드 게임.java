import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums[] = new int[5];

        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(nums[0] + nums[1] + nums[2] + nums[3] + nums[4]);
    }
}