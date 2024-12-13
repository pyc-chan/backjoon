import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] res = str.split(" ");
        int[] nums = new int[res.length];
        for(int i = 0; i < res.length; i++){
            nums[i] = Integer.parseInt(res[i]);
        }
        System.out.print(nums[1]-nums[0]+" "+nums[1]);
    }
}