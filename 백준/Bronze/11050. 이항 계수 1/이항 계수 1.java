import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] nums = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 1;
        int a = nums[0] - nums[1];
        for(int i = 1; i <= nums[0]; i++)
        {
            result *= i;
        }

        for (int i = 1; i <= nums[1]; i++)
        {
            result /= i;
        }

        for(int i = 1; i <= a; i++)
        {
            result /= i;
        }
        System.out.print(result);
    }
}