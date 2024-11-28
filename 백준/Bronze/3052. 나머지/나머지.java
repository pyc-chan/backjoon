import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[42];
        for(int i = 0; i<10; i++){
            nums[sc.nextInt()%42]++;
        }
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0){
                count++;
            }
        }
        System.out.println(count);


        sc.close();
    }
}
