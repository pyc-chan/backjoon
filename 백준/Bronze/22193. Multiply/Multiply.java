import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] nums = br.readLine().split(" ");
            int[] lengths = new int[2];
            for (int i = 0; i < nums.length; i++) {
                lengths[i] = Integer.parseInt(nums[i]);
            }
            String num1 = br.readLine();
            String num2 = br.readLine();
            num1 = num1.trim();
            num2 = num2.trim();
            if(!num1.equals("0") && !num2.equals("0")) {
                int[] number = new int[lengths[0] + lengths[1] - 1];
                int upper = 0;
                int result = 0;
                for (int i = 0; i < lengths[0] + lengths[1] - 1; i++) {
                    result = 0;
                    for (int j = 0; j <= i && j < lengths[0]; j++) {
                        if (i - j < lengths[1]) {
                            result = result + (num1.charAt(lengths[0] - j - 1) - '0')
                                    * (num2.charAt(lengths[1] - i + j - 1) - '0');
                        }
                    }
                    result = result + upper;
                    number[i] = result % 10;
                    upper = result / 10;
                }
                StringBuffer sb = new StringBuffer();
                if (upper != 0) {
                    sb.append(upper);
                }
                for (int i = number.length; i > 0; i--) {
                    sb.append(number[i - 1]);
                }
                System.out.print(sb);
            } else {
                System.out.print(0);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}