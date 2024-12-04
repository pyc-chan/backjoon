import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] nums = br.readLine().split(" ");
            int n = Integer.parseInt(nums[0]);
            int m = Integer.parseInt(nums[1]);

            String num1 = br.readLine();
            String num2 = br.readLine();

            int[] result = new int[n + m];

            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                    int sum = mul + result[i + j + 1];
                    result[i + j + 1] = sum % 10; 
                    result[i + j] += sum / 10;   
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int num : result) {
                if (!(sb.length() == 0 && num == 0)) { 
                    sb.append(num);
                }
            }
            if (sb.length() == 0) {
                sb.append(0);
            }
            System.out.print(sb.toString());
            br.close();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}