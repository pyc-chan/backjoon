import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int num3 =sc.nextInt();
        String str = String.valueOf(num1*num2*num3);
        int[] nums = new int[10];
        for(int i =0; i<str.length(); i++){
            nums[str.charAt(i)-'0']++;
        }
        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        sc.close();
    }
}
