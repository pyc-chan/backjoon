import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str1 = br.readLine();
            String str2 = br.readLine();
            String str3 = br.readLine();

            int n = Integer.parseInt(str1);
            String[] size = str2.split(" ");
            String[] nums = str3.split(" ");

            int t = Integer.parseInt(nums[0]);
            int p = Integer.parseInt(nums[1]);

            int num = 0;
            int countt = 0;
            for (String k : size) {
                num = Integer.parseInt(k);
                if(num != 0)
                countt = countt + ((num-1)/t)+1;
            }
            System.out.println(countt);
            System.out.println(n/p + " " +n%p);
        } catch (Exception e) {
        }
    }
}
