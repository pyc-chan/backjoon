import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] nums = new int[str.length];
        for(int i = 0; i<str.length; i++){
            nums[i] = Integer.parseInt(str[i]);
        }
        int result = 0;
        if(nums[0]>=nums[2]){
            result = 1;
        }else{
        result = (nums[2]-nums[1])/(nums[0]-nums[1]);
        if((nums[2]-nums[1])%(nums[0]-nums[1])!=0){
            result += 1;
        }
    }
        System.out.println(result);
    }
}