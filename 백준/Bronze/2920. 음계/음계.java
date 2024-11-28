import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[8];
        for(int i = 0; i< nums.length; i++){
            nums[i] = sc.nextInt();
        }
        boolean test = true;
        String result = "mixed";
        if(nums[0]==1){
            for(int i =0; i< nums.length-1; i++){
                if(nums[i]>nums[i+1]){
                    test = false;
                }
            }
            if(test==true){
                result = "ascending";
            }
        }else if(nums[0]==8){
            for(int i =0; i< nums.length-1; i++){
                if(nums[i]<nums[i+1]){
                    test = false;
                }
            }
            if(test==true){
                result= "descending";
            }
        }else{
            test = false;
        }
        System.out.println(result);
        sc.close();
    }
}
